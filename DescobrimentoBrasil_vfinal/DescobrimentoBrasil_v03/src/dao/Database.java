
package dao;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import jogo.Regiao;
import jogo.Pais;
import jogo.Estado;

public class Database {
       
    private static Database instance = null;
    private final Pais pais;
    private ArrayList<Regiao> regioes;
    private ArrayList<Estado> estados;
    private Estatisticas estatisticas;
    private Rodada rodadaAtual = null;
    private static final String ESTATISTICAS_XML = "estatisticas.xml";

    
    private Database(){
        pais = new Pais("Brasil");
        regioes = (ArrayList<Regiao>) pais.getRegioes();
        try {
            estatisticas = recuperarJogo();
        } catch (IOException ex) {}
        rodadaAtual = estatisticas.getRodadaAtual();
    }
    
    /**
     * Importa os dados a serem utilizados no jogo.
     * @param caminhoArquivo Caminho do arquivo em que as regiões, estados e
     *                       capitais a serem importados se encontram.
     * @return Estrutura que contém uma lista com as Regiões importadas do arquivo
     *         que, por sua vez, contém uma lista de Estados e suas respectivas
     *         capitais.
     */
    
    public Pais importaDados(String caminhoArquivo) {
        BufferedReader rd = null;
        String line;
        String[] splitLine;
        Regiao regiaoAtual = null;
        Estado estadoAtual = null;
        try{
            rd = new BufferedReader(new FileReader(caminhoArquivo));
            while(true){
                if(!(line = rd.readLine()).isEmpty()){
                    splitLine = line.split("@");
                    if(isRegiao(splitLine[0])) {
                        regiaoAtual = new Regiao(splitLine[1]);
                        regioes.add(regiaoAtual);
                        estados = (ArrayList<Estado>) regiaoAtual.getEstados();
                    } else if(isEstado(splitLine[0])){
                        estadoAtual = new Estado(splitLine[1]);
                        estados.add(estadoAtual);
                    } else if(isCapital(splitLine[0]))
                        estadoAtual.setCapital(splitLine[1]);
                }
            }
        } catch (Exception e){
            System.out.println("End of file.");
            if (rd != null)
                try {
                    rd.close();
            } catch (IOException ex) {
             e.printStackTrace();
            }
        }
        return pais;
    }

    /**
     * Implementação de Singleton
     * @return Instância única da Database.
     */
    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public Pais getPais() {
        return pais;
    }

    public Rodada getRodadaAtual() {
        return rodadaAtual;
    }
    
    /**
     * Salva as rodadas executadas e a pontuação dos jogadores em um arquivo XML
     * para posterior recuperação dos dados.
     * @param estatisticas 
     * @throws IOException 
     */
    public static void salvarJogo(Estatisticas estatisticas) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(ESTATISTICAS_XML))) {
            xmlEncoder.writeObject(estatisticas);
            xmlEncoder.close();
        }
    }
    
    /**
     * Recupera todas as rodadas executadas, juntamente com as pontuações em um
     * objeto da classe Estatística.
     * @return 
     * @throws IOException 
     */
    public static Estatisticas recuperarJogo() throws IOException {
        Estatisticas estatisticas = new Estatisticas();
        File arquivo = new File(ESTATISTICAS_XML);
        if (arquivo.exists()) {
            try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream(ESTATISTICAS_XML))) {
                estatisticas = (Estatisticas) xmlDecoder.readObject();
                xmlDecoder.close();
            }
        }    
        return estatisticas;
    }

    /**
     * Atualiza as estatísticas totais de erros e acertos e chama os métodos
     * responsáveis por persistir os dados e criar um Log da última rodada.
     */
    public void finalizarRodada(){
        estatisticas.getRodadasExecutadas().add(rodadaAtual);
        try {
            int[] acertos = {rodadaAtual.getRespostasRegioes().size(),
                            rodadaAtual.getRespostasEstados().size(),
                            rodadaAtual.getRespostasCapitais().size()};
            int[] erros = new int[3];
            for (int qtdErros : rodadaAtual.getErrosPorRegiao().values()) {
                erros[0] += qtdErros;
            }
            for (int qtdErros : rodadaAtual.getErrosPorEstado().values()) {
                erros[1] += qtdErros;
            }
            for (int qtdErros : rodadaAtual.getErrosPorCapital().values()) {
                erros[2] += qtdErros;
            }
            int[][] estatisticasTotais = new int[3][2];
            for(int i = 0; i < estatisticasTotais.length; i++){
                estatisticasTotais[i][0] += acertos[i];
                estatisticasTotais[i][1] += erros[i];
            }
            rodadaAtual.setNumAcertos(acertos);
            rodadaAtual.setNumErros(erros);
            estatisticas.setEstTotais(estatisticasTotais);
            salvarJogo(estatisticas);
            estatisticas.salvarLog();
        } catch (IOException ex) {}
    }
    

    private boolean isRegiao(String texto) {
        return "REGIAO".equals(texto.toUpperCase());   
    }
    private boolean isEstado(String texto) {
        return "ESTADO".equals(texto.toUpperCase());
    }
    private boolean isCapital(String texto) {
        return "CAPITAL".equals(texto.toUpperCase());
    }
} 
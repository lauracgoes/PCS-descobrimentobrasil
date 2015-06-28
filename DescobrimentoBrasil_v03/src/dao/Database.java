/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private static final String ESTATISTICAS_XML = "estatisticas.xml";

    
    private Database(){
        pais = new Pais("Brasil");
        regioes = (ArrayList<Regiao>) pais.getRegioes();
    }
    
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

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public Pais getPais() {
        return pais;
    }
    
    public static void salvarJogo(Estatisticas estatisticas) throws IOException {
        try (XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(ESTATISTICAS_XML))) {
            xmlEncoder.writeObject(estatisticas);
            xmlEncoder.close();
        }
    }
    
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
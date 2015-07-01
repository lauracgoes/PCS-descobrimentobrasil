
package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class Estatisticas {
    private ArrayList<Rodada> rodadasExecutadas = new ArrayList<>();
    private int[][] estTotais = new int[3][2];
    private Rodada rodadaAtual = new Rodada();
    
    public Rodada getRodadaAtual() {
        return rodadaAtual;
    }

    public ArrayList<Rodada> getRodadasExecutadas() {
        return rodadasExecutadas;
    }

    public void setRodadasExecutadas(ArrayList<Rodada> rodadasExecutadas) {
        this.rodadasExecutadas = rodadasExecutadas;
    }

    public int[][] getEstTotais() {
        return estTotais;
    }

    public void setEstTotais(int[][] estTotais) {
        for(int i = 0; i < estTotais.length; i++)
            for(int j = 0; j < estTotais[0].length; j++)
                this.estTotais[i][j] += estTotais[i][j];
    }
    
    /**
     * Persiste os dados referentes às estatísticas totais e à ultima rodada em
     * um Log para consulta e avaliação do desempenho do jogador.
     */
    public void salvarLog(){
        BufferedWriter wr = null;
        try {
            ArrayList<String> respostasRegioesAtual = rodadaAtual.getRespostasRegioes();
            ArrayList<String> respostasEstadosAtual = rodadaAtual.getRespostasEstados();
            ArrayList<String> respostasCapitaisAtual = rodadaAtual.getRespostasCapitais();
            HashMap<String, Integer> errosRegioesAtual = rodadaAtual.getErrosPorRegiao();
            HashMap<String, Integer> errosEstadosAtual = rodadaAtual.getErrosPorEstado();
            HashMap<String, Integer> errosCapitaisAtual = rodadaAtual.getErrosPorCapital();
            Set<String> regioes = errosRegioesAtual.keySet();
            Set<String> estados = errosEstadosAtual.keySet();
            Set<String> capitais = errosCapitaisAtual.keySet();
            
            wr = new BufferedWriter(new FileWriter("log.txt"));
            wr.append("Estatisticas gerais: ");
            wr.newLine(); wr.newLine();
            wr.append("Fase 1:");
            wr.newLine();
            wr.append("Acertos: ").append(Integer.toString(estTotais[0][0]));
            wr.newLine();
            wr.append("Erros: ").append(Integer.toString(estTotais[0][1]));
            wr.newLine(); wr.newLine();
            wr.append("Fase 2:");
            wr.newLine();
            wr.append("Acertos: ").append(Integer.toString(estTotais[1][0]));
            wr.newLine();
            wr.append("Erros: ").append(Integer.toString(estTotais[1][1]));
            wr.newLine(); wr.newLine();
            wr.append("Fase 3:");
            wr.newLine();
            wr.append("Acertos: ").append(Integer.toString(estTotais[2][0]));
            wr.newLine();
            wr.append("Erros: ").append(Integer.toString(estTotais[2][1]));
            wr.newLine(); wr.newLine(); wr.newLine();
            wr.append("Estatisticas do ultimo jogador:");
            wr.newLine(); wr.newLine();
            wr.append("Nome: ").append(rodadaAtual.getNome());
            wr.newLine();
            wr.append("Total de pontos: ").append(Integer.toString(rodadaAtual.getPontuacaoTotal()));
            wr.newLine(); wr.newLine();
            wr.append("Numero de acertos fase 1: ").append(Integer.toString(rodadaAtual.getNumAcertos()[0]));
            wr.newLine();
            wr.append("Numero de erros fase 1: ").append(Integer.toString(rodadaAtual.getNumErros()[0]));
            wr.newLine();
            wr.append("Acertos:");
            wr.newLine();
            for (String r : respostasRegioesAtual) {
                wr.newLine();
                wr.append(r);
            }
            wr.newLine(); wr.newLine();
            wr.append("Erros:");
            wr.newLine();
            for (String r : regioes) {
                wr.newLine();
                wr.append(r).append(" => ").append(Integer.toString(errosRegioesAtual.get(r))).append(" erros");
            }
            wr.newLine(); wr.newLine(); wr.newLine();
            wr.append("Numero de acertos fase 2: ").append(Integer.toString(rodadaAtual.getNumAcertos()[1]));
            wr.newLine();
            wr.append("Numero de erros fase 2: ").append(Integer.toString(rodadaAtual.getNumErros()[1]));
            wr.newLine();
            wr.append("Acertos:");
            wr.newLine();
            for (String e : respostasEstadosAtual) {
                wr.newLine();
                wr.append(e);
            }
            wr.newLine(); wr.newLine();
            wr.append("Erros:");
            wr.newLine();
            for (String e : estados) {
                wr.newLine();
                wr.append(e).append(" => ").append(Integer.toString(errosEstadosAtual.get(e))).append(" erros");
            }
            wr.newLine(); wr.newLine(); wr.newLine();
            wr.append("Numero de acertos fase 3: ").append(Integer.toString(rodadaAtual.getNumAcertos()[2]));
            wr.newLine();
            wr.append("Numero de erros fase 3: ").append(Integer.toString(rodadaAtual.getNumErros()[2]));
            wr.newLine();
            wr.append("Acertos:");
            wr.newLine();
            for (String c : respostasCapitaisAtual) {
                wr.newLine();
                wr.append(c);
            }
            wr.newLine(); wr.newLine();
            wr.append("Erros:");
            wr.newLine();
            for (String c : capitais) {
                wr.newLine();
                wr.append(c).append(" => ").append(Integer.toString(errosCapitaisAtual.get(c))).append(" erros");
            }
            wr.close();
        } catch (IOException ex) {}
    }
    
}

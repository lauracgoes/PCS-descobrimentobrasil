
package dao;

import java.util.ArrayList;
import java.util.HashMap;


public class Rodada {
    
    private int pontuacaoTotal = 0;
    private ArrayList<String> respostasRegioes = new ArrayList<>(); //Array com os acertos de primeira das Regiões
    private ArrayList<String> respostasEstados = new ArrayList<>(); //Array com os acertos de primeira dos Estados
    private ArrayList<String> respostasCapitais = new ArrayList<>(); //Array com os acertos de primeira das Capitais
    private HashMap<String, Integer> errosPorRegiao = new HashMap<>(); //Mapa com as Regiões erradas e o número de erros de cada uma
    private HashMap<String, Integer> errosPorEstado = new HashMap<>(); //Mapa com os Estados errados e o número de erros de cada um
    private HashMap<String, Integer> errosPorCapital = new HashMap<>(); //Mapa com as Capitais erradas e o número de erros de cada uma
    private int[] numAcertos = new int[3];
    private int[] numErros = new int[3];
    private String nome;
    private String path = "estatisticas.xml";
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPontuacaoTotal(int p) {
        pontuacaoTotal += p;
    }

    public int getPontuacaoTotal(){
        return pontuacaoTotal;
    }

    public int[] getNumAcertos() {
        return numAcertos;
    }

    public int[] getNumErros() {
        return numErros;
    }

    public void setNumAcertos(int[] numAcertos) {
        this.numAcertos = numAcertos;
    }

    public void setNumErros(int[] numErros) {
        this.numErros = numErros;
    }

    public HashMap<String, Integer> getErrosPorRegiao() {
        return errosPorRegiao;
    }

    public HashMap<String, Integer> getErrosPorEstado() {
        return errosPorEstado;
    }

    public HashMap<String, Integer> getErrosPorCapital() {
        return errosPorCapital;
    }

    public ArrayList<String> getRespostasRegioes() {
        return respostasRegioes;
    }

    public ArrayList<String> getRespostasEstados() {
        return respostasEstados;
    }

    public ArrayList<String> getRespostasCapitais() {
        return respostasCapitais;
    }

    public void setErrosPorRegiao(HashMap<String, Integer> errosPorRegiao) {
        this.errosPorRegiao = errosPorRegiao;
    }

    public void setErrosPorEstado(HashMap<String, Integer> errosPorEstado) {
        this.errosPorEstado = errosPorEstado;
    }

    public void setErrosPorCapital(HashMap<String, Integer> errosPorCapital) {
        this.errosPorCapital = errosPorCapital;
    }

    public void setRespostasRegioes(ArrayList<String> respostasRegioes) {
        this.respostasRegioes = respostasRegioes;
    }

    public void setRespostasEstados(ArrayList<String> respostasEstado) {
        this.respostasEstados = respostasEstado;
    }

    public void setRespostasCapitais(ArrayList<String> respostasCapitais) {
        this.respostasCapitais = respostasCapitais;
    }    
    
    public String getPath(){
        return path;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.HashMap;

/**
 *
 * @author Bianca
 */
public class Estatisticas {
    
    private int pontuacaoTotal = 0;
    private HashMap<String, Boolean> respostasRegioes = new HashMap<>();
    private HashMap<String, Boolean> respostasEstados = new HashMap<>();
    private HashMap<String, Boolean> respostasCapitais = new HashMap<>();
    private String nome;
    private String path = "estatisticas.xml";
    
    public void setPontuacaoTotal(int p) {
        pontuacaoTotal += p;
    }

    public String getNome() {
        return nome;
    }

    public HashMap<String, Boolean> getRespostasCapitais() {
        return respostasCapitais;
    }

    public HashMap<String, Boolean> getRespostasEstados() {
        return respostasEstados;
    }

    public HashMap<String, Boolean> getRespostasRegioes() {
        return respostasRegioes;
    }

    public void setRespostasCapitais(HashMap<String, Boolean> respostasCapitais) {
        this.respostasCapitais = respostasCapitais;
    }

    public void setRespostasEstados(HashMap<String, Boolean> respostasEstados) {
        this.respostasEstados = respostasEstados;
    }

    public void setRespostasRegioes(HashMap<String, Boolean> respostasRegioes) {
        this.respostasRegioes = respostasRegioes;
    }
    
    public int getPontuacaoTotal(){
        return pontuacaoTotal;
    }
    
    public void setRespostasRegioes(String nome, boolean resposta) {
        respostasRegioes.put(nome, resposta);
    }
    
    public void setRespostasEstados(String nome, boolean resposta) {
        respostasEstados.put(nome, resposta);
    }
    
    public void setRespostasCapitais(String nome, boolean resposta) {
        respostasCapitais.put(nome, resposta);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPath(){
        return path;
    }
}

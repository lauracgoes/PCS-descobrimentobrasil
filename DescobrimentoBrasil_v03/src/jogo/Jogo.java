/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import dao.Database;
import dao.Estatisticas;
import gui.InicioTeste;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Bianca
 */
public class Jogo {
    
    private static Database db = Database.getInstance();
    private static ArrayList<Regiao> regioesSorteadas = null;
    private static ArrayList<Estado> estadosSorteados = null;
    private static Estatisticas estatisticas = new Estatisticas();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pais pais = db.importaDados("C:\\Users\\Laura\\Desktop\\DescobrimentoBrasil_v03\\dadosBrasil-3.txt");
        InicioTeste.main(args);
    }

    public static void sortearRegioes() {
        int tam = 0;
        ArrayList<Regiao> regioes = (ArrayList<Regiao>) db.getPais().getRegioes();
        regioesSorteadas = new ArrayList<>();
        
        tam = regioes.size();
        List<Integer> numerosSorteados = sortearNumerosDistintos(tam);

        for (int i = 0; i < tam; i++) {
            int numeroSorteado = numerosSorteados.get(i);
            regioesSorteadas.add(regioes.get(numeroSorteado));
        }
    }
    
    public static void sortearEstados() {
        int tam = 0;
        ArrayList<Regiao> regioes = (ArrayList<Regiao>) db.getPais().getRegioes();
        ArrayList<Estado> estados = new ArrayList<>();
        estadosSorteados = new ArrayList<>();
        
        for (Regiao r : regioes) {
            tam += r.getEstados().size();
            estados.addAll(r.getEstados());
        }
        List<Integer> numerosSorteados = sortearNumerosDistintos(tam);
        
        for (int i = 0; i < tam; i++) {
            int numeroSorteado = numerosSorteados.get(i);
            estadosSorteados.add(estados.get(numeroSorteado));
        }
    }
    
    private static List<Integer> sortearNumerosDistintos(int qtdDeNumeros) {
        List<Integer> numerosSorteados = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < qtdDeNumeros; i++) {
            int sorteado;
            do {
                sorteado = rand.nextInt(qtdDeNumeros);
            } while (numerosSorteados.contains(sorteado));
            numerosSorteados.add(sorteado);
        }
        return numerosSorteados;
    }

    public static ArrayList<Estado> getEstadosSorteados() {
        return estadosSorteados;
    }

    public static ArrayList<Regiao> getRegioesSorteadas() {
        return regioesSorteadas;
    }

    public static Estatisticas getEstatisticas() {
        return estatisticas;
    }

}

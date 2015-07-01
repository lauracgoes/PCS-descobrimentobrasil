
package jogo;

import dao.Database;
import gui.Inicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Jogo {
    
    private static Database db = Database.getInstance();
    private static ArrayList<Regiao> regioesSorteadas = null;
    private static ArrayList<Estado> estadosSorteados = null;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pais pais = db.importaDados("dadosBrasil-3.txt");
        Inicio.main(args);
    }

    /**
     * Sorteia a ordem do array de Regiões
     */
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
    
    /**
     * Sorteia a ordem do array de Estados
     */
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
    
    /**
     * Sorteia números referentes às posições do Array a ser misturado
     * @param qtdDeNumeros Tamanho do array a ser sorteado
     * @return 
     */
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

    public static Database getDb() {
        return db;
    }
    
    

}

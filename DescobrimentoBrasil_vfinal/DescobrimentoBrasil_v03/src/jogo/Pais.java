
package jogo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bianca
 */
public class Pais { 
   
    private String nome = "";
    private List<Regiao> regioes = new ArrayList<>();;

    public Pais(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Regiao> getRegioes() {
        return regioes;
    }

    public void setRegioes(List<Regiao> regioes) {
        this.regioes = regioes;
    }
}
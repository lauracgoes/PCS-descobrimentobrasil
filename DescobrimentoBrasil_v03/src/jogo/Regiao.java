
package jogo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bianca
 */
public class Regiao { 
    
    private String nome;
    List<Estado> estados;
    


    public Regiao(String nome, List<Estado> estados) {
        this.nome = nome;
        this.estados = estados;
    }

    public Regiao() {
        nome = "";
        estados = new ArrayList<>();
    }

    public Regiao(String nome){
        this.nome = nome;
        estados = new ArrayList<>();
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
    
    
}

    
   
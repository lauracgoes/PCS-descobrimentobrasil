/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mapa_tela_preta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Flavio
 */
public class Mestre_De_Jogo {

    /**
     * @param args the command line arguments
     */
    
    private String Nome;
    private Pontuacao Pontos;
    private Fase_Regiao Fs_Regiao;
    private Fase_Capital Fs_Capital;
    private Fase_Cidade Fs_Cidade;
    
    Mestre_De_Jogo(){
            Pontos = new Pontuacao();
            Fs_Regiao = new  Fase_Regiao();
            Fs_Capital = new Fase_Capital();
            Fs_Cidade = new Fase_Cidade();
    }
    
    
    
    public static void main(String[] args) throws IOException {
       
       
        Mestre_De_Jogo m = new Mestre_De_Jogo();
        
        m.Jogar();
        
        
    }
    
    private void Jogar() throws IOException{
        
        Cadastra_Nome();
        
        Fs_Regiao.Carrega_Pontuacao(Pontos);
        Fs_Regiao.Comeca_Game();
        if(Fs_Regiao.Pega_Final_Fase() == true){
            Limpa_Tela();
        }
        Fs_Capital.Carrega_Pontuacao(Pontos);
        Fs_Capital.Comeca_Game();
        if(Fs_Capital.Pega_Final_Fase() == true){
            Limpa_Tela();
        }
        Fs_Cidade.Carrega_Pontuacao(Pontos);
        Fs_Cidade.Comeca_Game();
        
        Mostra_Estatistica();
    }
    
    private void Limpa_Tela(){
    for(int i=0 ;i<100;i++){
        System.out.println("\n");
    }
    
    }
    
    private void Cadastra_Nome(){
        
        String aux;
        
        System.out.println("Digite Seu Nome: ");
        aux = Fs_Regiao.Seta_Texto();
        Nome = aux;
    }
    
    private String Retorna_Nome(){
        
        return Nome;
    } 
    
    private void Mostra_Estatistica(){
        System.out.println("\n \n \n");
        System.out.println("Nome: "+ Nome);
        System.out.println("Pontuacao: "+ Pontos.Retorna_Pontuacao());
    }
    
}

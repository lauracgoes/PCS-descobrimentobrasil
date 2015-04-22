/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mapa_tela_preta;

import java.util.ArrayList;

/**
 *
 * @author Flavio
 */
public class Regiao {
    
    private int anda;
    private String Regiao_Aux;
    private String Sigla;
    ArrayList<Regiao> ArrayRegiao;

    
    Regiao(){
        anda =0;            
        ArrayRegiao = new ArrayList();
    }
    
    public void Carrega_Mapa_Aqui(String Regiao_Aux2 , String Sigla_Aux){
       
       Regiao a = new Regiao();
        
       a.Sigla = Sigla_Aux;
       a.Regiao_Aux = Regiao_Aux2; 
       
       ArrayRegiao.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Sigla_Aux,String Regiao_Aux2){
       
        
        
        for(int i = 0 ; i < ArrayRegiao.size() ;i++){
            
          if(ArrayRegiao.get(i).Sigla.contentEquals(Sigla_Aux)== true && ArrayRegiao.get(i).Regiao_Aux.contentEquals(Regiao_Aux2) == true){
              return true;
          }
       }
              
              return false;
    }
    
    void Imprime(){
        String aux="";
        
        System.out.println("---------------Tela de Escolhas--------------");
        System.out.println("Regiao      ||          Sigla");
        for(int i = 0; i< ArrayRegiao.size(); i++) {   
       
          
         System.out.println(ArrayRegiao.get(i).Regiao_Aux + "      ||      "+ ArrayRegiao.get(i).Sigla);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayRegiao.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayRegiao.get(Index).Sigla;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayRegiao.get(Index).Regiao_Aux;
    }
    
    public void Remove_String(String Regiao_Aux2){
    String aux="";

        for(int i = 0 ; i < ArrayRegiao.size() ;i++){
            
          if(ArrayRegiao.get(i).Regiao_Aux.contentEquals(Regiao_Aux2)== true){
            aux = ArrayRegiao.get(i).Regiao_Aux;
            ArrayRegiao.remove(i);
   
          }
       }
       
    
    
    }
    
    
    
    }


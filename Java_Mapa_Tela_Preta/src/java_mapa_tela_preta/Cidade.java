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
public class Cidade {
    
    private int anda;
    private String Cidade_Aux;
    private String Regiao;
    ArrayList<Cidade> ArrayCidade;

    
    Cidade(){
        anda =0;            
        ArrayCidade = new ArrayList();
    }
    
    public void Carrega_Mapa_Aqui(String Capital_Aux2 , String Regiao_Aux){
       
       Cidade a = new Cidade();
        
       a.Regiao = Regiao_Aux;
       a.Cidade_Aux = Capital_Aux2; 
       
       ArrayCidade.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Cidade_Aux2,String Regiao_Aux2){
       
        
        
        for(int i = 0 ; i < ArrayCidade.size() ;i++){
            
          if(ArrayCidade.get(i).Regiao.contentEquals(Regiao_Aux2)== true && ArrayCidade.get(i).Cidade_Aux.contentEquals(Cidade_Aux2) == true){
              return true;
          }
       }
              
              return false;
    }
    
    void Imprime(){
        String aux="";
        
        System.out.println("---------------Tela de Escolhas--------------");
        System.out.println("Capital      ||          Regiao");
        for(int i = 0; i< ArrayCidade.size(); i++) {   
       
  
         System.out.println(ArrayCidade.get(i).Cidade_Aux + "      ||      "+ ArrayCidade.get(i).Regiao);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayCidade.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayCidade.get(Index).Regiao;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayCidade.get(Index).Cidade_Aux;
    }
    
  
    public void Remove_String(String Regiao_Aux2){
    

        for(int i = 0 ; i < ArrayCidade.size() ;i++){
            
          if(ArrayCidade.get(i).Cidade_Aux.contentEquals(Regiao_Aux2)== true){
            
            ArrayCidade.remove(i);
            
          }
        }
    }
    
    
}

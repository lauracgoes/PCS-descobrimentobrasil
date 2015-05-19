/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_mapa_tela_preta;

import java.util.ArrayList;

/**
 *
 * @author Bianca
 */
public class Estado {
    
 
    //private String Cidade_Aux;
    private String nomeEstado;
    private String regiaoCorrespondente;
    ArrayList<Estado> ArrayCidade;

    
    Estado(){
           
        ArrayCidade = new ArrayList();
    }
    
    public void Carrega_Mapa_Aqui(String Capital_Aux2 , String Regiao_Aux){
       
       Estado a = new Estado();
        
       a.regiaoCorrespondente = Regiao_Aux;
       a.nomeEstado = Capital_Aux2; 
       
       ArrayCidade.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Cidade_Aux2,String Regiao_Aux2){
       
        
        
        for(int i = 0 ; i < ArrayCidade.size() ;i++){
            
          if(ArrayCidade.get(i).regiaoCorrespondente.contentEquals(Regiao_Aux2)== true && ArrayCidade.get(i).nomeEstado.contentEquals(Cidade_Aux2) == true){
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
       
  
         System.out.println(ArrayCidade.get(i).nomeEstado + "      ||      "+ ArrayCidade.get(i).regiaoCorrespondente);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayCidade.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayCidade.get(Index).regiaoCorrespondente;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayCidade.get(Index).nomeEstado;
    }
    
  
    public void Remove_String(String Regiao_Aux2){
    

        for(int i = 0 ; i < ArrayCidade.size() ;i++){
            
          if(ArrayCidade.get(i).nomeEstado.contentEquals(Regiao_Aux2)== true){
            
            ArrayCidade.remove(i);
            
          }
        }   
    }
    
    
}

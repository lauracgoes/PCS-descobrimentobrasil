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
public class Capital {
    

    
    //private String Capital_Aux;
    private String nomeCapital;
    private String estadoCorrespondente;
    ArrayList<Capital> ArrayCapital;

    
    Capital(){
           
        ArrayCapital = new ArrayList();
    }
    
    public void Carrega_Mapa_Aqui(String Capital_Aux2 , String Regiao_Aux){
       
       Capital a = new Capital();
        
       a.estadoCorrespondente = Regiao_Aux;
       a.nomeCapital = Capital_Aux2; 
       
       ArrayCapital.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Capital_Aux,String Regiao_Aux2){
       
        
        
        for(int i = 0 ; i < ArrayCapital.size() ;i++){
            
          if(ArrayCapital.get(i).estadoCorrespondente.contentEquals(Regiao_Aux2)== true && ArrayCapital.get(i).nomeCapital.contentEquals(Capital_Aux) == true){
              return true;
          }
       }
              
              return false;
    }
    
    void Imprime(){
        String aux="";
        
        System.out.println("---------------Tela de Escolhas--------------");
        System.out.println("Capital      ||          Regiao");
        for(int i = 0; i< ArrayCapital.size(); i++) {   
       
  
         System.out.println(ArrayCapital.get(i).nomeCapital + "      ||     "+ ArrayCapital.get(i).estadoCorrespondente);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayCapital.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayCapital.get(Index).estadoCorrespondente;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayCapital.get(Index).nomeCapital;
    }
    
  
    public void Remove_String(String Regiao_Aux2){
    

        for(int i = 0 ; i < ArrayCapital.size() ;i++){
            
          if(ArrayCapital.get(i).nomeCapital.contentEquals(Regiao_Aux2)== true){
            
            ArrayCapital.remove(i);
            
          }
        }
    }
    
    
}

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
public class Capital {
    
    private int anda;
    private String Capital_Aux;
    private String Regiao;
    ArrayList<Capital> ArrayCapital;

    
    Capital(){
        anda =0;            
        ArrayCapital = new ArrayList();
    }
    
    public void Carrega_Mapa_Aqui(String Capital_Aux2 , String Regiao_Aux){
       
       Capital a = new Capital();
        
       a.Regiao = Regiao_Aux;
       a.Capital_Aux = Capital_Aux2; 
       
       ArrayCapital.add(a);
       
        
    }
    
    public boolean Verifica_Contain_Sigla(String Capital_Aux,String Regiao_Aux2){
       
        
        
        for(int i = 0 ; i < ArrayCapital.size() ;i++){
            
          if(ArrayCapital.get(i).Regiao.contentEquals(Regiao_Aux2)== true && ArrayCapital.get(i).Capital_Aux.contentEquals(Capital_Aux) == true){
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
       
  
         System.out.println(ArrayCapital.get(i).Capital_Aux + "      ||      "+ ArrayCapital.get(i).Regiao);
              
        }
    }

    public int Retorna_Tamanho_Lista(){
    
        return ArrayCapital.size();
    }
     
    public String Retorna_Sigla(int Index){
        
        return ArrayCapital.get(Index).Regiao;
    }
    
    
    public String Retorna_Regiao(int Index){
        
        return ArrayCapital.get(Index).Capital_Aux;
    }
    
  
    public void Remove_String(String Regiao_Aux2){
    

        for(int i = 0 ; i < ArrayCapital.size() ;i++){
            
          if(ArrayCapital.get(i).Capital_Aux.contentEquals(Regiao_Aux2)== true){
            
            ArrayCapital.remove(i);
            
          }
        }
    }
    
    
}

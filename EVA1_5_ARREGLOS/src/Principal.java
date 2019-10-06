/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

     
    public static void main(String[] args) {
       // Declaracion de arreglos
       int aiDatos [] = new int [10]; //Un arreglo en java es un objeto
       //N --> # de Elementos
       //0 --> 1er elemnto
       //N - 1 --> Ultimo elemnto 
        System.out.println(aiDatos);
        for (int i = 0; i < aiDatos.length; i ++) {
          aiDatos[i]= (int)(Math.random() * 100) + 1; 
        }
        System.out.println("For normal");
           for (int i = 0; i < aiDatos.length; i ++) {
               System.out.println(aiDatos[i]);   
               
           }
           System.out.println("For each");
           // for - Each
           for (int aiDato : aiDatos) {
               System.out.println(aiDato);
            
        }
        
    }
    
}

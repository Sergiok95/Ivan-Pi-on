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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declaracion
        int aiDatos [],a,b;
        int [] aiDatos2,x,y;
        // 
        int aiCopia[];
        //Inicializacion del arreglo
        aiCopia = new int[100000];
        //Llenar con valores aleatorios
        for (int i = 0; i < aiCopia.length; i ++) {
          aiCopia[i]= (int)(Math.random() * 100) + 1; 
          
        }
        //son objetos en java
        //la memoria es consecutiva
        //SON DE ACCESO ALEATORIA
        aiCopia[4] = 5000;
        aiCopia[69]= 500;
        //SON MUY RÁPIDOS
        //SON INMUTABLES (UNA VEZ QUE ACCINAN EL TAMAÑO DEL ARREGLO NO SE LO PUEDE CAMBIAR)
    }
    
}

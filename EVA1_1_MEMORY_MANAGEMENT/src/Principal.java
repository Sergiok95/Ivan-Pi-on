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
        
        int a = 100;
        float b = 55.5f;
        System.out.println("inicia main");
        a();
        System.out.println("Termina Main");
    }
    public static void a(){
        System.out.println("inicia a");
        b();
        System.out.println("Termina a");
    }
    public static void b(){
        System.out.println("inicia b");
         c();  
        System.out.println("Termina b");
     
    }
    public static void c(){
     System.out.println("inicia c");
     
        System.out.println("Termina c");   
    }
}

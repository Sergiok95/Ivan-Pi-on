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
        int i =10;
        Principal pobj = new Principal();
        System.out.println(i);
        System.out.println(pobj);
        pobj = null; //Nos deshacemos de la memoria usada
    }
    
}

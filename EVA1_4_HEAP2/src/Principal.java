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
       Principal pObj = new Principal();
        System.out.println(pObj);
        foo(pObj);
    }
    public  static void foo (Principal param){
        System.out.println(param);
    }
}

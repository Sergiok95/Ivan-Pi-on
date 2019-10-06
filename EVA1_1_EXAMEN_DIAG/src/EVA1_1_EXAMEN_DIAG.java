/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IVÁN PIÑÓN PEÑA
 */
public class EVA1_1_EXAMEN_DIAG  {
    
    public static void main(String[] args) {
        System.out.println(ganeraClave());
       // Algo obj= new Algo();
    }
  // Modificador de acceso [Static] [ Valor de retorno] nombre del metodo
        public static String ganeraClave(){
            // no se nesecita estanciar para poderse usar (static)
            //estanciar es un objeto
            int iVal;
            iVal = (int) (Math.random() * 10000 );
            String resu="";
            if (iVal <10){//necesita 3 ceros 000
            resu = "000" + iVal;
                } else if (iVal < 100){ //necesita 2 ceros 00
                resu = "00" + iVal;
                    } else if (iVal < 1000){ // necesita 1 cero 0
                    resu = "0" + iVal;
                        } else {// cuatro digitos 
                        resu= "" + iVal; 
                        }
            
            return resu;
            //si utilizas un metodo estatico tiene que ser en una clase estatica
        }

    private static boolean generaClave() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
abstract class Algo{
 // impide la crear la instancia de objetos   
}
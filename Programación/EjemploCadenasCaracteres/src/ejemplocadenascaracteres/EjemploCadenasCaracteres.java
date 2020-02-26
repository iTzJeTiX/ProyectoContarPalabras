             /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocadenascaracteres;

/**
 *
 * @author alumno
 */
public class EjemploCadenasCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String nombre = "    Peter el Panda de mi casa      ";
        int longitud = nombre.length();
        
        System.out.println("La longitud de nombre es: " + longitud);
     
        char caracter = nombre.charAt(4);
        System.out.println("El caracter que está en la posición nº4 es " + caracter);
        
        char ultimo = nombre.charAt(nombre.length()-1);
        System.out.println("El último caracter es: " + ultimo);
        
        String mifrase, mifrasemayuscula,minuevafrase, minuevafrase2;
        
        mifrase = ("Yeah I think you cute when you tell me lies, always let you win when I know I'm right.");
        
        mifrasemayuscula = mifrase.toUpperCase();
        System.out.println("Mi frase en mayúsculas es:\n" + mifrasemayuscula);
        
        minuevafrase = mifrasemayuscula.replace('E', 'A');
        System.out.println("Mi nueva frase es:\n" + minuevafrase);
        
        minuevafrase2 = mifrase.replace("", "a");
        System.out.println("Mi frase sin espacios es:\n" + minuevafrase2);
        
        String nombreA = ("PepeHands");
        String nombreB = ("pepehands");
        System.out.println("A es igual que B:" + (nombreA.equalsIgnoreCase(nombreB)));
        
    }
    
}

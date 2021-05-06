/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional19;
import java.util.Scanner;
/**
 *
 * @author pc14
 */
public class Condicional19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un carácter y le diré si es vocal");
        char caracter=entrada.next().charAt(0);
        
        switch(caracter){
            case 'a':System.out.println("El caracter es una vocal, es la A");
            break;
            case 'e':System.out.println("El caracter es una vocal, es la E");
            break;
            case 'i':System.out.println("El caracter es una vocal, es la I");
            break;
            case 'o':System.out.println("El caracter es una vocal, es la O");
            break;
            case 'u':System.out.println("El caracter es una vocal, es la U");
            break;
            default:System.out.println("El caracter no es una vocal");
            break;
        }
        
    }
    
}

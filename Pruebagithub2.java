/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub2;
import java.util.Scanner;
/**
 *
 * @author nacho
 */
public class Pruebagithub2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingres un número: ");
        float a = teclado.nextFloat();
        
        System.out.println("Ahora ingrese el segundo: ");
        float b = teclado.nextFloat();
        
        float res1 = a+b;
        float res2 = a-b;
        float res3 = a*b;
        float res4 = a/b;
        
        System.out.println("La suma entre "+a+" y "+b+" da "+res1);
        System.out.println("La resta entre "+a+" y "+b+" da "+res2);
        System.out.println("La multiplicación entre "+a+" y "+b+" da "+res3);
        System.out.println("La división entre "+a+" y "+b+" da "+res4);
    }
    
}

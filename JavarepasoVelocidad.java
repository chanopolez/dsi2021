/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarepaso.velocidad;
import java.util.Scanner;
/**
 *
 * @author nacho
 */
public class JavarepasoVelocidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        double n = 3.6;
        System.out.println("Ingrese el número de la velocidad en km/h para ser transformada en m/s:");
        int a=entrada.nextInt();
        
        double b = a/n;
        
        System.out.println("La velocidad de "+a+" km/h es igual a "+b+" m/s");
    }
    
}

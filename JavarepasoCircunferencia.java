/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarepaso.circunferencia;
import java.util.Scanner;
/**
 *
 * @author nacho
 */
public class JavarepasoCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double n = 3.6;
        System.out.println("Ingrese el radio de una circunferencia:");
        int a=entrada.nextInt();
        
        double b = 2*Math.PI*a;
        
        double d = Math.pow(a,2);
        double c = Math.PI*d;
        
        System.out.println("Longitud de dicha circunferencia: "+b);
        System.out.println("Área de dicha circunferencia: "+c);
    }
    
}

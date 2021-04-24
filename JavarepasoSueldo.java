/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgh3.sueldo;
import java.util.Scanner;
/**
 *
 * @author nacho
 */
public class Pgh3Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de horas trabajadas en un mes: ");
        float a = teclado.nextFloat();
        
        System.out.println("Y ahora el costo de dichas horas: ");
        float b = teclado.nextFloat();
        
        float smes = a*b;
        float saño = a*b*12;
        
        System.out.println("El sueldo mensual de un empleado es de $"+smes+" y el anual es de $"+saño);
    }
    
}

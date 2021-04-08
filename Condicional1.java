/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional1;
import java.util.Scanner;
/**
 *
 * @author pc15
 */
public class Condicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese un número entero: ");
        int n = entrada.nextInt();
        
        if(n%2==0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
            
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional6;
import java.util.Scanner;
/**
 *
 * @author pc15
 */
public class Condicional6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el límite:");
        int a = entrada.nextInt();
        
        System.out.println("Números del 1 al "+a+":");
        int i = 1;
        
        while(i<=a){
            System.out.println(i);
            i++;
        }
    }
    
}

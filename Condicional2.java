/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional2;
import java.util.Scanner;
/**
 *
 * @author pc15
 */
public class Condicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese un número entero: ");
        int n = entrada.nextInt();
        
        if(n%10==0){
            System.out.println("El número es múltiplo de 10");
        }
        else{
            System.out.println("El número no es múltiplo de 10");
        }
    }
    
}

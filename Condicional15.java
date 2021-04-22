/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional15;
import java.util.Scanner;
/**
 *
 * @author pc15
 */
public class Condicional15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número máximo:");
        int b=entrada.nextInt();
        int a=0;
        while(a<b){
            a++;
            if(a%6==0){
                System.out.println(a);
            }
        }
    }
    
}

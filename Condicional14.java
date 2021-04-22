/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional14;
import java.util.Scanner;
/**
 *
 * @author pc15
 */
public class Condicional14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número máximo:");
        int b=entrada.nextInt();
        int a=0;
        for(int i=1;i<=b;i++){
            a++;
            if(a%6==0){
                System.out.println(a);
            }
        }
    }
    
}

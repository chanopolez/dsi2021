/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional13;

/**
 *
 * @author pc15
 */
public class Condicional13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1;
        
        do{
            a++;
            if(a%10==0){
                System.out.println(a);
            }
        }while(a<=2000);
    }
    
}

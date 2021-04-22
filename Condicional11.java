/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional11;

/**
 *
 * @author pc15
 */
public class Condicional11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1;
        
        for(int i=1;i<=2000;i++){
            if(a%10==0){
                System.out.println(a);
            }
            a++;
        }
    }
    
}

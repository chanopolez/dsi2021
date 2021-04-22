/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional10;

/**
 *
 * @author pc15
 */
public class Condicional10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1;
        
        for(int i=1;i<=100;i++){
            if(a%2==0&&a%3==0){
                System.out.println(a);
            }
            a++;
        }
    }
    
}

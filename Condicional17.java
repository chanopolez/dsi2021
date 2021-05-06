/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional17;
import java.util.Scanner;
/**
 *
 * @author pc14
 */
public class Condicional17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número para saber qué día es");
        int dia=entrada.nextInt();
        String nombre;
        
        switch(dia){
            case 1:nombre="Lunes";
            break;
            case 2:nombre="Martes";
            break;
            case 3:nombre="Miércoles";
            break;
            case 4:nombre="Jueves";
            break;
            case 5:nombre="Viernes";
            break;
            case 6:nombre="Sábado";
            break;
            case 7:nombre="Domingo";
            break;
            default:nombre="Día inválido";
            break;
        }
        
        System.out.println(nombre);
    }
    
}

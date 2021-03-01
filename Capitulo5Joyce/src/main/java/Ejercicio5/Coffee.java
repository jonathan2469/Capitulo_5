/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Coffee {
    
    public static void main(String[] args) {       
        Scanner leer = new Scanner(System.in);
        int resp ;
        double cuenta = 0;
        do {           
            System.out.println("(1) AMERICAN......... 1.99");
            System.out.println("(2) ESPRESSO..........2.50");
            System.out.println("(3) LATTE.............2.15");
            System.out.println("Introduzca su opción");
            resp = leer.nextInt();
            switch (resp) {
                case 1:
                    cuenta += 1.99;
                    break;
                case 2:
                    cuenta += 2.50;
                    break;
                case 3:
                    cuenta += 2.15;
                    break;
            }
            System.out.println("Carrito: "+ cuenta);
            
        } while (resp!=0);
        
        System.out.println("La cuenta es de: " + cuenta);
    }
    
    
    
}

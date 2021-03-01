/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author jonat
 */
public class TestDigitalCamera {
     public static void main(String[] args) {
        DigitalCamera Camara = new DigitalCamera("Sony",3.0);
        
        System.out.println("La marca es "+Camara.getBrand()+" los pixeles son "+Camara.getMegapixels()+" el precio es "+Camara.getPrice());
    }
}
           
    

    
    
    
    


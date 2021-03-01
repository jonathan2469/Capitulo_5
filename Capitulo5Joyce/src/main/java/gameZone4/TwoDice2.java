/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

/**
 *
 * @author jonat
 */
public class TwoDice2 {
    public static void main(String[] args) {
        Die dado1 = new Die();
        Die dado2 = new Die();
        
        System.out.println(dado1+"\n"+dado2);
        if (dado1.getNumero()==dado2.getNumero()) {
            System.out.println("Los dados son iguales");
        }else if(dado1.getNumero()>dado2.getNumero()){
            System.out.println("El dado 1 es mayor");
        }else{
            System.out.println("El dado 2 es mayor");
        }
        
        
    }
}

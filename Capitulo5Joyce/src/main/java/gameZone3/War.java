/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;

/**
 *
 * @author jonat
 */
public class War {
    public static void main(String[] args) {
        Card carta1 = new Card();
        Card carta2 = new Card();
        
        System.out.println(carta1);
        System.out.println(carta2);
        
        carta1.calcularAlto(carta2);
    }
}

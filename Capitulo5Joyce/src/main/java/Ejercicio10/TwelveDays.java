/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class TwelveDays {
            
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
    Integer dia = 0;
    
    Integer resp = 0;
    

        do {
        
        System.out.println("Escoja un dia para la parte de la cancion de The Twelve Days of Christmas.");
        
        dia = leer.nextInt();
        
        switch(dia){
    
        case 1:
            System.out.println("On the first day of Christmas my true love gave to me\n" +
            "A partridge in a pear tree");
                break;
        
        case 2:
            System.out.println("On the second day of Christmas my true love gave to me\n" +
            "Two turtle doves and a partridge in a pear tree");
        
        case 3:
            System.out.println("On the third day of Christmas my true love gave to me\n" +
            "Three French hens, two turtle doves and a partridge in a pear tree");
                break;
        case 4:
            System.out.println("On the fourth day of Christmas my true love gave to me\n" +
            "Four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
        
        case 5:
            System.out.println("On the fifth day of Christmas my true love gave to me\n" +
            "Five gold rings, four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
             
        case 6:
            System.out.println("On the sixth day of Christmas my true love gave to me\n" +
            "Six geese a laying, five gold rings\n" +
            "Four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
                
        case 7:
            System.out.println("On the seventh day of Christmas my true love gave to me\n" +
            "Seven swans a swimming, six geese a laying, five gold rings\n" +
            "Four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
                
        case 8:
            System.out.println("On the eighth day of Christmas my true love gave to me\n" +
            "Eight maids a milking, seven swans a swimming\n" +
            "Six geese a laying, five gold rings\n" +
            "Four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
                
        case 9:
            System.out.println("On the ninth day of Christmas\n" +
            "Nine ladies dancing, eight maids a milking\n" +
            "Seven swans a swimming, six geese a laying, five gold rings\n" +
            "Four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
                
        case 10:
            System.out.println("On the tenth day of Christmas my true love gave to me\n" +
            "Ten lords a leaping, nine ladies dancing, eight maids a milking\n" +
            "Seven swans a swimming, six geese a laying, five gold rings\n" +
            "Four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
                
        case 11:
            System.out.println("On the eleventh day of Christmas my true love gave to me\n" +
            "Eleven pipers piping, ten lords a leaping\n" +
            "Nine ladies dancing, eight maids a milking\n" +
            "Seven swans a swimming, six geese a laying, five gold rings\n" +
            "Four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
                
        case 12:
            System.out.println("On the twelfth day of Christmas my true love gave to me\n" +
            "Twelve drummers drumming, eleven pipers piping\n" +
            "Ten lords a leaping, nine ladies dancing, eight maids a milking\n" +
            "Seven swans a swimming, six geese a laying, five gold rings\n" +
            "Four calling birds, three French hens\n" +
            "Two turtle doves and a partridge in a pear tree");
                break;
        default:
        
    }
        System.out.println("¿Desea dia de la semana? [0 = no, 1 = si]");
        
        resp = leer.nextInt();
        
        } while (resp == 1);
            
    
        
    }
    
        
}
    
    


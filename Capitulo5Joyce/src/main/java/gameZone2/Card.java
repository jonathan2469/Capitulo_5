/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

/**
 *
 * @author jonat
 */
public class Card {
    private int num1;
    private int num2;
    private int num3;
    
    public Card(){
        this.num1= ((int)(Math.random() * 100) % 10 );
        do {
            this.num2 = ((int)(Math.random() * 100) % 10 );
        } while (this.num2==this.num1);
        do {
            this.num3 = ((int)(Math.random() * 100) % 10 );
        } while ((this.num3==this.num1)||(this.num3==this.num2));       
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    @Override
    public String toString() {
        return  "num1=" + num1 + ", num2=" + num2 + ", num3=" + num3;
    }
}

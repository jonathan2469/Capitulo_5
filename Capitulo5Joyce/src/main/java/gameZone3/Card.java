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
public class Card {
    private Palo suit;
    private int n;

    public Card() {
        this.setN();
        this.setSuit();
    }

    public void calcularAlto(Card carta2){
        if (this.n > carta2.getN()) {
            System.out.println("El jugador 1 ha ganado");
        }else if (this.n < carta2.n) {
            System.out.println("El jugador 2 ha ganado");
        }else{
            System.out.println("Ha sido empate");
        }
    }
    
    public void setSuit() {
        int num = ((int) (Math.random() * 100) % 4 + 1);
        switch (num) {
            case 1:
                setSuit('c');
                break;
            case 2:
                setSuit('d');
                break;
            case 3:
                setSuit('t');
                break;
            case 4:
                setSuit('p');
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public void setSuit(char a) {
        switch (a) {
            case 'c':
                this.suit = Palo.CORAZONES;
                break;
            case 'd':
                this.suit = Palo.DIAMANTES;
                break;
            case 't':
                this.suit = Palo.TREBOLES;
                break;
            case 'p':
                this.suit = Palo.PICAS;
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }

    public void setN(int n) {
        if ((n >= 1) || (n <= 13)) {
            this.n = n;
        } else {
            this.n = 1;
        }
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", n=" + n + '}';
    }

    public void setN() {
        final int CARDS_IN_SUIT = 13;
        this.n = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
    }

    public Palo getSuit() {
        return this.suit;

    }

    public int getN() {
        return this.n;
    }
}

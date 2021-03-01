/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Rental[] eventos = new Rental[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre de contrato #" + (i + 1) + ": ");
            String name = leer.nextLine();
            
            System.out.print("Numero de minutos: ");
            int inv = leer.nextInt();
            leer.nextLine();
            System.out.println("");
            
            Rental e1 = new Rental(name, inv);
            eventos[i] = e1;
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(eventos[i].aPagar());
            Rental.SammysMotto();
        }
        
        Rental S = Rental.largerRental(eventos[0], eventos[1]);
        System.out.println(S.aPagar());
        
        Rental q = Rental.largerRental(eventos[1], eventos[2]);
        System.out.println(q.aPagar());
        
        Rental T = Rental.largerRental(eventos[0], eventos[2]);
        System.out.println(T.aPagar());

    }
}

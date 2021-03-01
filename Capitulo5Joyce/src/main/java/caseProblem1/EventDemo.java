/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class EventDemo {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        Event[] eventos = new Event[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre del evento " + (i + 1) + ": ");
            String nombre = leer.nextLine();
            
            System.out.print("Numero de invitados: ");
            int invitados = leer.nextInt();
            leer.nextLine();
            System.out.println("");
            
            Event e = new Event(nombre, invitados);
            eventos[i] = e;
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(eventos[i].eCosto());
            Event.CarlysMotto();
        }
        
        Event k = Event.largerEvent(eventos[0], eventos[1]);
        System.out.println(k.eCosto());
        
        Event j = Event.largerEvent(eventos[1], eventos[2]);
        System.out.println(j.eCosto());
        
        Event t = Event.largerEvent(eventos[0], eventos[2]);
        System.out.println(t.eCosto());
        
    }
}

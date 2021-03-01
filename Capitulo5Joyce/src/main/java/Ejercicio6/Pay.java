/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Pay {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int retiro=0;
        int plan=1;
        
        
        System.out.println("Introduzca el nivel del trabajador");
        int skill = leer.nextInt();
        System.out.println("Introduzca las horas trabajadas");
        int hours = leer.nextInt();
        if((skill==2)||(skill==3)){
            System.out.println("Introduzca el plan de seguro:");
            plan = leer.nextInt();
            if (skill==3) {
                System.out.println("Desea participar en el plan de retiro?");
                retiro = leer.nextInt();
            }
        }
        
        Worker tra = new Worker(skill, plan, hours, retiro);
        
        System.out.println(tra.getSalario());
        
    }
}

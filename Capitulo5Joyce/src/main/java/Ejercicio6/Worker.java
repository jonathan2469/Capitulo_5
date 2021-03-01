/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author jonat
 */
public class Worker {
    private int skill;
    private int insurance;
    private int hours;
    private int retiro;
    private double salario;

    public Worker(int skill, int insurance, int hours, int retiro) {
        this.skill = skill;
        this.insurance = insurance;
        this.hours = hours;
        this.retiro = retiro;
        calcularSalario();
    }
    
    public void calcularSalario(){
        if (this.hours>40) {
            this.salario += (40*getPay())+((getPay()+getPay()*1.5)*(this.hours-40));
        }else{
            this.salario += (this.hours*getPay());
        }
        this.salario+=getInsurance();
        if (this.retiro==1) {
            this.salario = this.salario-(this.salario*.03);
        }
        if (salario<=0) {
            System.out.println("Error, compureba tus datos");
        }
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public double getInsurance(){
        switch (this.insurance) {
            case 1:
                return -32.5;                
            case 2:
                return -20;
            case 3:
                return -10;                  
        }
        return 0;       
    }
    
    public double getPay(){
        switch (this.skill) {
            case 1:
                return 17;               
            case 2:
                return 20;
            case 3:
                return 22;
        }
        return 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author jonat
 */
public class Invoice {
    private Integer invoice;
    private Integer due;
    private Integer dia;
    private Integer mes;
    private Integer año;
    
    public Invoice(Integer invoice, Integer due, Integer dia, Integer mes, Integer año) {
        if (invoice < 1000) {
        
            this.invoice = 0;   
        
        }else{
        
            this.invoice = invoice;
        
        }
        
        this.due= due;
        
        if ((mes == 1)||(mes == 3)||(mes == 5)||(mes == 7)||(mes == 8)||(mes == 10)||(mes == 12)) {
            
            if ((dia <= 1)||(dia >= 31)) {
                
                this.dia = 0;
                
            }else{
                
                this.dia = dia;
            
            }            
        }
        
        if ((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11)){
            
            if ((dia <= 1)||(dia >= 30)) {
                
                this.dia = 0;
                
            }else{
                
                this.dia = dia;
            
            }
            
        }else{
        
            if (this.dia == 0) {
                
                this.mes = 0;
                
            }
        
        }
        
        if (mes == 2) {
            
            if ((dia <= 1)||(dia >= 29)) {
                
                this.dia = 0;
                
            }else{
                
                this.dia = dia;
            
            }
            
        }else{
        
            if (this.dia == 0) {
                
                this.mes = 0;
                
            }
        
        }
        
        if ((año < 2011)||(año > 2017)) {
            
            this.año = 0;
            
        }else{
            
            this.año = año;
        
        }
     
    }

    
    public void Print() {
       System.out.println("Numero de factura " + invoice + "; Saldo pendiente " + due + " Fecha " + dia + "/"+ mes + "/" + año) ;
    }

}


        /**if ( (dia<=0) || (dia>=31) ) {
            
            this.dia = 0;
        
        }else{
            
            this.dia = dia;
            
        }
        
        if((mes <= 0)||(mes >= 12)) {
        
            this.mes = 0;
        
        }else{
        
            this.mes = mes;
        
        }**/
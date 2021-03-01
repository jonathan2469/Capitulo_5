/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author jonat
 */
public class DigitalCamera {
   
    private String brand;
    private Double megapixels;
    private Double price;

    public DigitalCamera(String brand, Double megapixels) {
    this.brand = brand;
    
    if(megapixels >= 10){
        
    this.megapixels = 10.0;
    
    }else{
    
        this.megapixels = megapixels;
    }      
    if(megapixels <= 6){
    
        this.price = 99.0;
    
    }else{
    
        this.price = 129.0;
        
    }
}
    
    public String getBrand() {
        return brand;
    }

    public Double getMegapixels() {
        return megapixels;
    }

    public Double getPrice() {
        return price;
    }
}

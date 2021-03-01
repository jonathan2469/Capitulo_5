/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author jonat
 */
public class Park {
    private String nombre;
    private Integer tamaño;
    private Boolean picnic;
    private Boolean tennis;
    private Boolean playground;
    private Boolean pool;
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public void setTamaño(Integer tamaño) {
        if ((tamaño >= 400)||(tamaño <= 0)) {
           System.out.println("No se acepta el valor dado");
        }else{
        this.tamaño = tamaño;
        }
    }

    public Boolean getPicnic() {
        return picnic;
    }

    public void setPicnic(Boolean picnic) {
        this.picnic = picnic;
    }

    public Boolean getTennis() {
        return tennis;
    }

    public void setTennis(Boolean tennis) {
        this.tennis = tennis;
    }

    public Boolean getPlayground() {
        return playground;
    }

    public void setPlayground(Boolean playground) {
        this.playground = playground;
    }

    public Boolean getPool() {
        return pool;
    }

    public void setPool(Boolean pool) {
        this.pool = pool;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaexamenparcial;

import java.util.List;

/**
 *
 * @author droco
 */
public class Bicicleteria {
    private List<Bicicleta> bicicletas;
    private float ganancias;
    private int cantidad_ventas;

    public Bicicleteria(List<Bicicleta> bicicletas, float ganancias, int cantidad_ventas) {
        this.bicicletas = bicicletas;
        this.ganancias = ganancias;
        this.cantidad_ventas = cantidad_ventas;
    }

    public Bicicleteria() {
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(List<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public int getCantidad_ventas() {
        return cantidad_ventas;
    }

    public void setCantidad_ventas(int cantidad_ventas) {
        this.cantidad_ventas = cantidad_ventas;
    }
    
    public void comprar_bicicleta(Bicicleta bicicleta){
        this.bicicletas.add(bicicleta);
        this.ganancias -= bicicleta.getPrecio();
        System.out.println("Se compró la bicicleta modelo: "+ bicicleta.getModelo());                
      
    }
    public void vender_bicicleta (Bicicleta bicicleta){
        this.cantidad_ventas +=1;
        this.bicicletas.remove(bicicleta);
        this.ganancias += bicicleta.getPrecio();
        System.out.println("Se vendió la bicicleta");
    }
    
}

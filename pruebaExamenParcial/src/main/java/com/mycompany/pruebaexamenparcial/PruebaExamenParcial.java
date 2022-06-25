/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebaexamenparcial;

import java.util.ArrayList;

/**
 *
 * @author droco
 */
public class PruebaExamenParcial {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        Bicicleta bici1 = new Bicicleta("1001","montabike",2020,50000);
        
        System.out.println(bici1.getModelo());
        System.out.println(bici1.getPrecio());
        System.out.println(bici1.getNro_serie());
        
        System.out.println("-------------------------------------------");
        bici1.setPrecio(30000);
        System.out.println("Precio modificado de la bici1:"+bici1.getPrecio());
        
        Bicicleta bici2 = new Bicicleta("2001", "cross", 2022, 250000);
        Bicicleta bici3 = new Bicicleta("3001", "stree", 2022, 15000);
        Bicicleta bici4 = new Bicicleta("1002", "montanbike", 2021, 75000);
        
        System.out.println("-------------------------------------------");
        System.out.println(bici2.getModelo());
        System.out.println(bici2.getPrecio());
        System.out.println(bici2.getNro_serie());      
        System.out.println("-------------------------------------------");
        
        ArrayList<Bicicleta> bicicletas_b1 = new ArrayList<>();
        bicicletas_b1.add(bici1);
        bicicletas_b1.add(bici2);
        bicicletas_b1.add(bici3);
        
        Bicicleteria maxiBici = new Bicicleteria(bicicletas_b1, 1000000, 0);
        System.out.println("-------------------------------------------");
        System.out.println("Creada la bicicleteria maxiBici");
        System.out.println("Las ganancias iniciales son: $" + maxiBici.getGanancias());
        System.out.println("Cantidad de ventas iniciales son: " + maxiBici.getCantidad_ventas());
        System.out.println("-------------------------------------------");
        
        maxiBici.comprar_bicicleta(bici4);
        System.out.println("Las ganancias son: $" + maxiBici.getGanancias());
        System.out.println("Cantidad de ventas son: " + maxiBici.getCantidad_ventas());
        
        maxiBici.vender_bicicleta(bici1);
        System.out.println("Las ganancias son: $" + maxiBici.getGanancias());
        System.out.println("Cantidad de ventas son: " + maxiBici.getCantidad_ventas());
        
        maxiBici.vender_bicicleta(bici2);
        System.out.println("Las ganancias son: $" + maxiBici.getGanancias());
        System.out.println("Cantidad de ventas son: " + maxiBici.getCantidad_ventas());
        
        maxiBici.vender_bicicleta(bici3);
        System.out.println("Las ganancias son: $" + maxiBici.getGanancias());
        System.out.println("Cantidad de ventas son: " + maxiBici.getCantidad_ventas());
        
        maxiBici.vender_bicicleta(bici4);
        System.out.println("Las ganancias son: $" + maxiBici.getGanancias());
        System.out.println("Cantidad de ventas son: " + maxiBici.getCantidad_ventas());
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto = new Producto("Azúcar", 100.99, 50);
        
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("...............................");
        
        producto.setNombre("Harina");
        System.out.println("Nuevo producto: " + producto.getNombre());
        producto.setPrecio(0);
        System.out.println("Precio: " + producto.getPrecio());
        producto.setCantidad(-1);
        System.out.println("Cantidad: " + producto.getCantidad());
    }
}

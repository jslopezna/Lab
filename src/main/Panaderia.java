/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author equipo
 */
public class Panaderia {
    private String nombre; 
    private String direccion; 
    private int telefono; 
    private Inventario inventario; 
    private ArrayList<Producto> productos;
    private Venta [] historialVentas; 
    private Panaderia panaderia; 

    public Panaderia(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
         
    }

  

    public void CrearInventario() {
        this.inventario = new Inventario();
    }

    public void generarVentas(Venta venta) {
        //ventas.put(venta); 
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author equipo
 */
public class Inventario {

    private Panaderia panaderia;
    private ArrayList<Producto> productos;

    public Inventario() {
        this.panaderia = panaderia;
        this.productos = new ArrayList<>();
    }

    public void addProduct(int codigo, String nombre, String marca, double precio, int cantidad) {
        //String producto= null; 
        Producto producto = new Producto(codigo, nombre, marca, precio, cantidad);
        String sc = codigo + nombre + "  Marca:" + marca + "  Precio=$" + precio + "  Cantidad=" + cantidad + "und." + "\n";

        this.productos.add(producto);

    }

    /*public void ModificarEstadoProducto(int codigo, String nombre, String marca, double precio, int cantidad) {
        Producto NewProduct = new Producto(codigo, nombre, marca, precio, cantidad);
        //codigo= codigo-1;
        //int x = 0;
       for(int x=1; x<= productos.size(); x++){
            if (x == codigo) {
                NewProduct = productos.get(x);
            } 
        }
    }*/
    public void VisualizarInventario() {

        for (int i = 0; i < this.productos.size(); i++) {
            System.out.println(" " + this.productos.get(i).getCodigo() + this.productos.get(i).getNombre() + "  Marca: " + this.productos.get(i).getMarca() + "  Precio= $" + this.productos.get(i).getPrecio() + " Canridad= " + this.productos.get(i).getCantidad());
        }

    }

    public void Venta(int codigo, int cantidad) {
        //codigo--; 
        int x = 0;
        int newCantidad = 0;
        while (x <=productos.size()) {
            if (x == codigo) {
                newCantidad = productos.get(x).getCantidad() - cantidad;
                productos.get(x).setCantidad(newCantidad);
            }else{
                x
            }
        }

    }

    public Panaderia getPanaderia() {
        return panaderia;
    }

    public void setPanaderia(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    /*public void setProductos(String producto, int codigo) {
        //TreeMap<codigo>= 
        
        productos.add(codigo,producto);
        //)= <codigo,producto>; 
    }*/
}

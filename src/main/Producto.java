/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author equipo
 */
public class Producto {
   //private String codigo; 
    private String nombre; 
    private String marca; 
    private double precio;
    private int cantidad; 

    public Producto(/*String codigo,*/ String nombre,String marca, double precio, int cantidad) {
       // this.codigo = codigo;
        this.nombre = nombre;
        this.marca= marca; 
        this.precio = precio;
        this.cantidad = cantidad;
    }

    

   /* public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

   

      
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Panaderia fierro= new Panaderia("El fierro", "Cra 55a #168a-11", 6706960);
        Inventario inventario= new Inventario(); 
        fierro.CrearInventario();
        while(true){
        System.out.println("Bienvenido a la panaderia el fierro");
        System.out.println("Escoga alguna de las siguientes opciones");
        
        System.out.println("1. Ver inventario");
        System.out.println("2. Agregar Producto");
        System.out.println("3. Modificar Porducto");
        Scanner input= new Scanner(System.in); 
        int opcion= 0;
        opcion= input.nextInt();
        
        
        
        
        
        switch (opcion){
            case 1:
                inventario. VisualizarInventario();
                break; 
            case 2:
                System.out.println("ingrese el nombre del producto");
                String  nombre= input.next();
                System.out.println("Ingrese la marca del producto");
                String marca= input.next();
                System.out.println("Ingrese el codigo del producto");
                int codigo= input.nextInt(); 
                System.out.println("Ingrese el precio del producto");
                double precio= input.nextDouble(); 
                System.out.println("Ingrese la cantidad");
                int cantidad= input.nextInt(); 
                
                inventario.addProduct( codigo, nombre, marca, precio, cantidad);
                
                 break; 
            case 3: 
                System.out.println("Ingrese el codigo del producto que desea modificar");
                int cod= input.nextInt();
                System.out.println("ingrese el nuevo nombre del producto");
                String name= input.next();
                System.out.println("Ingrese la marca del producto");
                String marc= input.next();
                System.out.println("Ingrese el nuevo precio del producto");
                double preci= input.nextDouble(); 
                System.out.println("Ingrese la cantidad");
                int cant= input.nextInt(); 
                 //String sc =cod+name+"Precio=" + preci+"cantidad=" +cant;
                inventario.ModificarEstadoProducto(cod, name,marc,  preci, cant);
               break; 
            
        }
     
    }    
    }
    
}

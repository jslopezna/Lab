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
    
    public void addProduct( int codigo,String nombre,String marca, double precio, int cantidad){
        //String producto= null; 
        Producto producto = new Producto(codigo,nombre,marca, precio, cantidad); 
        String sc =codigo+nombre+"  Marca:"+marca+"  Precio=$" +precio+"  Cantidad=" +cantidad+"und."+"\n";
          
        this.productos.add(producto);
        
    }
    public void ModificarEstadoProducto(int codigo, String nombre,String marca, double precio,int cantidad){
        Producto NewProduct= new Producto (  nombre, marca, precio, cantidad );
       String sc =codigo+nombre+"Precio=" + precio+"cantidad=" +cantidad;
       codigo --;
        int x=0;
         while( x <= productos.size()){
             if( x== codigo){
                 sc =productos.get(x);
               }else{
               x++;  
             }
             
       
        
    }    
    }
     public void VisualizarInventario( ){
         
         for(int i= 0; i<=this.productos.size();i++){
        
         System.out.println( " "+ this.productos.get(i).getCodigo()+this.productos.get(i).getNombre()+"  Marca"+this.productos.get(1).getMarca()+"  Precio= $"}
        /* Set set = productos.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print( mentry.getKey() );
         System.out.println(mentry.getClass());
          */
      }
     

    public Panaderia getPanaderia() {
        return panaderia;
    }

    public void setPanaderia(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    
    public void setProductos(String producto, int codigo) {
        //TreeMap<codigo>= 
        
        productos.add(codigo,producto);
        //)= <codigo,producto>; 
    }

    
    
    
}

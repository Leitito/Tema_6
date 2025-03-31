/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author leiti
 */
public class Tarea6EDClaseProductos {
    public void aplicarDescuento(double precioProducto, int numProductos){  
        double Total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*Descuento_20_porciento;
            imprimir_precio(Total);
        }else {
            Total = precioProducto*0.95;
            imprimir_precio(Total);
        }   

    }

    private void imprimir_precio(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
    private static final double Descuento_20_porciento = 0.8;
}
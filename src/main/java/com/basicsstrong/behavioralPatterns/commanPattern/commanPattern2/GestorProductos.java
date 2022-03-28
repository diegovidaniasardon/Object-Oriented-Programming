package com.basicsstrong.behavioralPatterns.commanPattern.commanPattern2;

public class GestorProductos {
    public void validarProducto(Producto producto) {

        if (producto.getPrecio() < 100) {

            System.out.println("producto valido");
        } else {

            System.out.println("producto invalido");
        }
    }

    public void imprimirProducto(Producto producto) {

        System.out.println(producto.getNombre());
        System.out.println(producto.getId());
        System.out.println(producto.getPrecio());
    }

    public void enviarPorCorreo(Producto producto) {

        System.out.println(producto.getNombre() +"enviado por correo") ;
    }
}

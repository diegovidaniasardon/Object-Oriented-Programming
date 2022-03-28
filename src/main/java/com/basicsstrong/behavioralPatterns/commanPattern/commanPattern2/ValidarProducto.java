package com.basicsstrong.behavioralPatterns.commanPattern.commanPattern2;

public class ValidarProducto implements TareaProducto{

    @Override
    public void ejecutar(Producto producto) {
        if (producto.getPrecio() < 100) {

            System.out.println("producto valido");
        }else {

            System.out.println("producto invalido");
        }

    }

}

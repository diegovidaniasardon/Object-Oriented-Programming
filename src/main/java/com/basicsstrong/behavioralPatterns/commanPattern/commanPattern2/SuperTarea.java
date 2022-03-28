package com.basicsstrong.behavioralPatterns.commanPattern.commanPattern2;

import java.util.ArrayList;
import java.util.List;

public class SuperTarea implements TareaProducto {

    private List<TareaProducto> lista= new ArrayList<TareaProducto>();

    public void addTarea(TareaProducto tarea) {
        lista.add(tarea);
    }
    @Override
    public void ejecutar(Producto producto) {

        lista.forEach((t)->t.ejecutar(producto));;


    }

}
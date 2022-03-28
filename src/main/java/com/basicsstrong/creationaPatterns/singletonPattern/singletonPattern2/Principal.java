package com.basicsstrong.creationaPatterns.singletonPattern.singletonPattern2;

public class Principal {

    public static void main(String[] args) {

        Configurador c= Configurador.getConfigurador("miurl", "mibaseDatos");


        System.out.println(c.getUrl());

        System.out.println(c.getBaseDatos());

        Configurador a= Configurador.getConfigurador("miurl2", "mibaseDatos2");

        System.out.println(a.getUrl());

        System.out.println(a.getBaseDatos());

    }
}

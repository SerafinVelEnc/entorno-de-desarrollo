package com.servelenc.pccomponentes;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        /**
         *  Codigo a ejecutar por un administrativo de la empresa
         *  Codigo para introducir información de procesadores
         */

        Procesador amd = new Procesador();

        amd.setId(1);
        amd.setMarca("Ryzen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();

        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("intel");

        System.out.println(pentium.getId());
        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());

        PlacaBase asus = new PlacaBase();

        asus.setId(3);
        asus.setMarca("B550-Plus");
        asus.setFabricante("asus");

        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());

    }
}


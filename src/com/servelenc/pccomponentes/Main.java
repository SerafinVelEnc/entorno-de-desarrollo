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

        Memoria kingston = new Memoria();

        kingston.setId(4);
        kingston.setFabricante("Kingston");
        kingston.setCapacidad("8GB");

        System.out.println(kingston.getId());
        System.out.println(kingston.getFabricante());
        System.out.println(kingston.getCapacidad());

        Memoria corsair = new Memoria();

        corsair.setId(5);
        corsair.setFabricante("Corsair");
        corsair.setCapacidad("16GB");

        System.out.println(corsair.getId());
        System.out.println(corsair.getFabricante());
        System.out.println(corsair.getCapacidad());

        DiscoDuro seagate = new DiscoDuro();

        seagate.setId(6);
        seagate.setFabricante("Seagate");
        seagate.setCapacidad("2GB");

        System.out.println(seagate.getId());
        System.out.println(seagate.getFabricante());
        System.out.println(seagate.getCapacidad());

        DiscoDuro samsung = new DiscoDuro();

        samsung.setId(7);
        samsung.setFabricante("Samsung");
        samsung.setCapacidad("16GB");

        System.out.println(samsung.getId());
        System.out.println(samsung.getFabricante());
        System.out.println(samsung.getCapacidad());


    }
}


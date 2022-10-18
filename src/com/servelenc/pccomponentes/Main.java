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

        PlacaBase msi = new PlacaBase();

        msi.setId(4);
        msi.setMarca("B660M-A");
        msi.setFabricante("msi");

        System.out.println(msi.getId());
        System.out.println(msi.getMarca());
        System.out.println(msi.getFabricante());

        Memoria kingston = new Memoria();

        kingston.setId(5);
        kingston.setFabricante("Kingston");
        kingston.setCapacidad("8GB");

        System.out.println(kingston.getId());
        System.out.println(kingston.getFabricante());
        System.out.println(kingston.getCapacidad());

        Memoria corsair = new Memoria();

        corsair.setId(6);
        corsair.setFabricante("Corsair");
        corsair.setCapacidad("16GB");

        System.out.println(corsair.getId());
        System.out.println(corsair.getFabricante());
        System.out.println(corsair.getCapacidad());

        DiscoDuro seagate = new DiscoDuro();

        seagate.setId(7);
        seagate.setFabricante("Seagate");
        seagate.setCapacidad("2GB");

        System.out.println(seagate.getId());
        System.out.println(seagate.getFabricante());
        System.out.println(seagate.getCapacidad());

        DiscoDuro samsung = new DiscoDuro();

        samsung.setId(8);
        samsung.setFabricante("Samsung");
        samsung.setCapacidad("16GB");

        System.out.println(samsung.getId());
        System.out.println(samsung.getFabricante());
        System.out.println(samsung.getCapacidad());

        CajaTorre nfortec = new CajaTorre();

        nfortec.setId(9);
        nfortec.setFabricante("Nfortec");
        nfortec.setSize(" 400x208x458mm");

        System.out.println(nfortec.getId());
        System.out.println(nfortec.getFabricante());
        System.out.println(nfortec.getSize());

        CajaTorre nox = new CajaTorre();

        nox.setId(10);
        nox.setFabricante("Nox");
        nox.setSize("360 x 180 x 410mm");

        System.out.println(nox.getId());
        System.out.println(nox.getFabricante());
        System.out.println(nox.getSize());

        VentiladorCpu tempest = new VentiladorCpu();

        tempest.setId(11);
        tempest.setFabricante("Tempest");
        tempest.setSize("122 x 156 x 74,5mm");

        System.out.println(tempest.getId());
        System.out.println(tempest.getFabricante());
        System.out.println(tempest.getSize());

        VentiladorCpu cooler = new VentiladorCpu();

        cooler.setId(12);
        cooler.setFabricante("Cooler");
        cooler.setSize("100 x 160 x 251mm");

        System.out.println(cooler.getId());
        System.out.println(cooler.getFabricante());
        System.out.println(cooler.getSize());

        FuenteAlimentacion owlotech = new FuenteAlimentacion();

        owlotech.setId(13);
        owlotech.setFabricante("Owlotech");
        owlotech.setPotencia("600W");

        System.out.println(owlotech.getId());
        System.out.println(owlotech.getFabricante());
        System.out.println(owlotech.getPotencia());

        FuenteAlimentacion forgeon = new FuenteAlimentacion();

        forgeon.setId(14);
        forgeon.setFabricante("Forgeon");
        forgeon.setPotencia("750W");

        System.out.println(forgeon.getId());
        System.out.println(forgeon.getFabricante());
        System.out.println(forgeon.getPotencia());

    }
}


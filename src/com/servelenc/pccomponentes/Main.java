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

        TarjetaGrafica zotac = new TarjetaGrafica();

        zotac.setId(15);
        zotac.setFabricante("Zotac");
        zotac.setCapacidad("12GB");

        System.out.println(zotac.getId());
        System.out.println(zotac.getFabricante());
        System.out.println(zotac.getCapacidad());

        TarjetaGrafica xfx = new TarjetaGrafica();

        xfx.setId(16);
        xfx.setFabricante("Xfx");
        xfx.setCapacidad("12GB");

        System.out.println(xfx.getId());
        System.out.println(xfx.getFabricante());
        System.out.println(xfx.getCapacidad());

        TarjetaDeSonido creative = new TarjetaDeSonido();

        creative.setId(17);
        creative.setFabricante("Creative");
        creative.setNumeroDeCanales("5.1");

        System.out.println(creative.getId());
        System.out.println(creative.getFabricante());
        System.out.println(creative.getNumeroDeCanales());

        TarjetaDeSonido startech = new TarjetaDeSonido();

        startech.setId(17);
        startech.setFabricante("StarTech");
        startech.setNumeroDeCanales("5.1");

        System.out.println(startech.getId());
        System.out.println(startech.getFabricante());
        System.out.println(startech.getNumeroDeCanales());

        GrabadoraDeDvd hitachi = new GrabadoraDeDvd();

        hitachi.setId(18);
        hitachi.setFabricante("Hitachi");
        hitachi.setModosDeGrabacion("DVD-R / RW, DVD+R / RW, CD-R /RW");

        System.out.println(hitachi.getId());
        System.out.println(hitachi.getFabricante());
        System.out.println(hitachi.getModosDeGrabacion());

        GrabadoraDeDvd lg = new GrabadoraDeDvd();

        lg.setId(19);
        lg.setFabricante("Lg");
        lg.setModosDeGrabacion("DVD-R / RW, DVD+R / RW, DVD-R / RW doble capa, DVD+R / RW doble capa, CD-R / RW");

        System.out.println(lg.getId());
        System.out.println(lg.getFabricante());
        System.out.println(lg.getModosDeGrabacion());

        Monitor philips = new  Monitor();

        philips.setId(20);
        philips.setFabricante("Philips");
        philips.setSize("23.8 pulgadas");

        System.out.println(philips.getId());
        System.out.println(philips.getFabricante());
        System.out.println(philips.getSize());

        Monitor samgsung = new  Monitor();

        samgsung.setId(21);
        samgsung.setFabricante("Samsung");
        samgsung.setSize("34 pulgadas");

        System.out.println(samgsung.getId());
        System.out.println(samgsung.getFabricante());
        System.out.println(samgsung.getSize());

        Teclado owlotech2 = new Teclado();

        owlotech2.setId(22);
        owlotech2.setFabricante("Owlotech");
        owlotech2.setPeso("300gr");

        System.out.println(owlotech2.getId());
        System.out.println(owlotech2.getFabricante());
        System.out.println(owlotech2.getPeso());

        Teclado tempest2 = new Teclado();

        tempest2.setId(22);
        tempest2.setFabricante("Tempest2");
        tempest2.setPeso("300gr");

        System.out.println(tempest2.getId());
        System.out.println(tempest2.getFabricante());
        System.out.println(tempest2.getPeso());

        Raton hp = new Raton();

        hp.setId(23);
        hp.setFabricante("Hp");
        hp.setColor("negro");

        System.out.println(hp.getId());
        System.out.println(hp.getFabricante());
        System.out.println(hp.getColor());

        Raton newskill = new Raton();

        newskill.setId(24);
        newskill.setFabricante("Newskill");
        newskill.setColor("blanco");

        System.out.println(newskill.getId());
        System.out.println(newskill.getFabricante());
        System.out.println(newskill.getColor());

        Altavoces logitech = new Altavoces();

        logitech.setId(25);
        logitech.setFabricante("Hp");
        logitech.setPotencia("80W");

        System.out.println(logitech.getId());
        System.out.println(logitech.getFabricante());
        System.out.println(logitech.getPotencia());

        Altavoces woxter = new Altavoces();

        woxter.setId(26);
        woxter.setFabricante("Woxter");
        woxter.setPotencia("150W");

        System.out.println(woxter.getId());
        System.out.println(woxter.getFabricante());
        System.out.println(woxter.getPotencia());
    }
}


package com.servelenc.pccomponentes;

public class TarjetaGrafica {
    /**
     * Atributos, propiedades y variables estada
     */
    private Integer id;
    private String fabricante;
    private String capacidad;

    /**
     * Metodos, funciones y compertamiento
     */

    public Integer getId(){

        return id;
    }
    public void setId(Integer id){

        this.id = id;
    }
    public String getFabricante(){

        return fabricante;
    }
    public void setFabricante (String fabricante){

        this.fabricante = fabricante;
    }
    public String getCapacidad(){

        return capacidad;
    }
    public void setCapacidad(String capacidad){

        this.capacidad = capacidad;
    }
}

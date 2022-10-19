package com.servelenc.pccomponentes;

public class Raton {
    /**
     * Atributos, propiedades y variables estada
     */
    private Integer id;
    private String fabricante;
    private String color;

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
    public String getColor(){

        return color;
    }
    public void setColor(String color){

        this.color = color;
    }
}

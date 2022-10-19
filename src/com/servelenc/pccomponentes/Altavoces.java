package com.servelenc.pccomponentes;

public class Altavoces {
    /**
     * Atributos, propiedades y variables estada
     */
    private Integer id;
    private String fabricante;
    private String potencia;

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
    public String getPotencia(){

        return potencia;
    }
    public void setPotencia(String potencia){

        this.potencia = potencia;
    }
}

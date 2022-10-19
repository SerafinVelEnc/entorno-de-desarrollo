package com.servelenc.pccomponentes;

public class TarjetaDeSonido {
    /**
     * Atributos, propiedades y variables estada
     */
    private Integer id;
    private String fabricante;
    private String numeroDeCanales;

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
    public String getNumeroDeCanales(){

        return numeroDeCanales;
    }
    public void setNumeroDeCanales(String numeroDeCanales){

        this.numeroDeCanales = numeroDeCanales;
    }
}

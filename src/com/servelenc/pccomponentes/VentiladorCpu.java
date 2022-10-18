package com.servelenc.pccomponentes;

public class VentiladorCpu {
    /**
     * Atributos, propiedades y variables estada
     */
    private Integer id;
    private String fabricante;
    private String size;

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
    public String getSize(){

        return size;
    }
    public void setSize(String size){

        this.size = size;
    }
}

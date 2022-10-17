package com.servelenc.pccomponentes;

/**
 * clase procesador
 */
public class Procesador {

    /**
     * Atributos, propiedades y variables estada
     */
    private Integer id;
    private String marca;
    private String fabricante;

    /**
     * Metodos, funciones y compertamiento
     */

    public Integer getId(){

        return id;
    }
    public void setId(Integer id){

        this.id = id;
    }
    public String getMarca(){

        return marca;
    }
    public void setMarca (String marca){

        this.marca = marca;
    }
    public String getFabricante(){

        return fabricante;
    }
    public void setFabricante(String fabricante){

        this.fabricante = fabricante;
    }

}

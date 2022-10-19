package com.servelenc.pccomponentes;

public class GrabadoraDeDvd {
    /**
     * Atributos, propiedades y variables estada
     */
    private Integer id;
    private String fabricante;
    private String modosDeGrabacion;

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
    public String getModosDeGrabacion(){

        return modosDeGrabacion;
    }
    public void setModosDeGrabacion(String modosDeGrabacion){

        this.modosDeGrabacion = modosDeGrabacion;
    }
}

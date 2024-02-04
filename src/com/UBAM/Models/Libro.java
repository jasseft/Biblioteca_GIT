/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Models;

/**
 *
 * @author jasse
 */
public class Libro {
    
    private int libro_Id;
    private String libro_Nombre;
    private String Genero;
    private String Editorial;
    private String Idioma;
    private int libro_Cantidad;
    private double libro_Costo;
    
    public Libro(){
        
    }

    public Libro(int libro_Id, String libro_Nombre) {
        this.libro_Id = libro_Id;
        this.libro_Nombre = libro_Nombre;
    }

    public int getLibro_Id() {
        return libro_Id;
    }

    public void setLibro_Id(int libro_Id) {
        this.libro_Id = libro_Id;
    }

    public String getLibro_Nombre() {
        return libro_Nombre;
    }

    public void setLibro_Nombre(String libro_Nombre) {
        this.libro_Nombre = libro_Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public int getLibro_Cantidad() {
        return libro_Cantidad;
    }

    public void setLibro_Cantidad(int libro_Cantidad) {
        this.libro_Cantidad = libro_Cantidad;
    }

    public double getLibro_Costo() {
        return libro_Costo;
    }

    public void setLibro_Costo(double libro_Costo) {
        this.libro_Costo = libro_Costo;
    }

    @Override
    public String toString() {
        return libro_Nombre;
    }
    
}

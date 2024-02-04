/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Models;

/**
 *
 * @author jasse
 */
public class Editorial {
    
    private int editorial_Id;
    private String editorial_Nombre;
    private int editorial_Activo;
    
    public Editorial(){
        
    }

    public Editorial(int editorial_Id, String editorial_Nombre) {
        this.editorial_Id = editorial_Id;
        this.editorial_Nombre = editorial_Nombre;
    }

    public int getEditorial_Id() {
        return editorial_Id;
    }

    public void setEditorial_Id(int editorial_Id) {
        this.editorial_Id = editorial_Id;
    }

    public String getEditorial_Nombre() {
        return editorial_Nombre;
    }

    public void setEditorial_Nombre(String editorial_Nombre) {
        this.editorial_Nombre = editorial_Nombre;
    }

    public int getEditorial_Activo() {
        return editorial_Activo;
    }

    public void setEditorial_Activo(int editorial_Activo) {
        this.editorial_Activo = editorial_Activo;
    }

    @Override
    public String toString() {
        return editorial_Nombre;
    }
    
    
}

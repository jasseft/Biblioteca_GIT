/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Controllers;

import com.UBAM.ConexionMySQL.ConexionMySQL;
import com.UBAM.Models.Editorial;
import com.UBAM.Models.Genero;
import com.UBAM.Models.Idioma;
import com.UBAM.Models.Libro;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

public class ComboController {
    
    private ConexionMySQL conn = new ConexionMySQL();
    Connection selectConn = conn.abrirConexion();
    
    public ArrayList<Editorial> obtenerEditoriales(){
        ArrayList<Editorial> lista_editoriales = new ArrayList<>();
        try{
               
            String query = "CALL showAllEditoriales()";
            PreparedStatement stmt = selectConn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Editorial edit = new Editorial();
                edit.setEditorial_Id(rs.getInt("editorial_Id"));
                edit.setEditorial_Nombre(rs.getString("editorial_Nombre"));
                lista_editoriales.add(edit);
            }
            System.out.println("Editoriales obtenidas");
        } catch(Exception e){
            System.out.println("Error al buscar editoriales." + e);
        }
        
        return lista_editoriales;
    }

    public ArrayList<Genero> obtenerGeneros(){
        ArrayList<Genero> lista_generos = new ArrayList<>();
        try{
               
            String query = "CALL showAllGeneros()";
            PreparedStatement stmt = selectConn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Genero gen = new Genero();
                gen.setGeneroId(rs.getInt("generoId"));
                gen.setGeneroNombre(rs.getString("generoNombre"));
                lista_generos.add(gen);
            }
            System.out.println("Géneros obtenidos");
        } catch(Exception e){
            System.out.println("Error al buscar géneros." + e);
        }
        
        return lista_generos;
    }
    
    public ArrayList<Idioma> obtenerIdiomas(){
        ArrayList<Idioma> lista_idiomas = new ArrayList<>();
        try{
               
            String query = "CALL showAllIdiomas()";
            PreparedStatement stmt = selectConn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Idioma idiomas = new Idioma();
                idiomas.setIdioma_Id(rs.getInt("Idioma_Id"));
                idiomas.setIdioma_Nombre(rs.getString("Idioma_Nombre"));
                lista_idiomas.add(idiomas);
            }
            System.out.println("Idiomas obtenidos");
        } catch(Exception e){
            System.out.println("Error al buscar idiomas." + e);
        }
        
        return lista_idiomas;
    }
    
    public ArrayList<Libro> obtenerLibros(){
        ArrayList<Libro> lista_libros = new ArrayList<>();
        try{
               
            String query = "CALL showAllLibros()";
            PreparedStatement stmt = selectConn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Libro libros = new Libro();
                libros.setLibro_Id(rs.getInt("libro_Id"));
                libros.setLibro_Nombre(rs.getString("libro_Nombre"));
                lista_libros.add(libros);
            }
            System.out.println("Libros obtenidos");
        } catch(Exception e){
            System.out.println("Error al buscar idiomas." + e);
        }
        
        return lista_libros;
    }
}

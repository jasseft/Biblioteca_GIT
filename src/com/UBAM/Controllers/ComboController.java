/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Controllers;

import com.UBAM.ConexionMySQL.ConexionMySQL;
import com.UBAM.Models.Editorial;
import com.UBAM.Models.Genero;
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
            System.out.println("Categoria obtenida");
        } catch(Exception e){
            System.out.println("Error al buscar categorías." + e);
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
            System.out.println("Categoria obtenida");
        } catch(Exception e){
            System.out.println("Error al buscar categorías." + e);
        }
        
        return lista_generos;
    }
}

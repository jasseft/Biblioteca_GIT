/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Controllers;

import com.UBAM.ConexionMySQL.ConexionMySQL;
import com.UBAM.Models.Editorial;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;

public class ComboController {
    
    private ConexionMySQL conn = new ConexionMySQL();
    Connection cn = conn.abrirConexion();
    ResultSet rs;
    Statement st;
    
    public ArrayList<Editorial> obtenerEditoriales(){
        ArrayList<Editorial> lista_editoriales = new ArrayList<>();
        try{
            String consulta = "SELECT *FROM tbl_cat_editorial";
            st = cn.createStatement();
            rs = st.executeQuery(consulta);
            
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

    // Puedes agregar métodos similares para otros JComboBox (género, idioma, etc.)
    // Asegúrate de cerrar los recursos de la base de datos adecuadamente.
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Controllers;

import com.UBAM.ConexionMySQL.ConexionMySQL;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jasse
 */
public class LibroController {
    
    private ConexionMySQL conn = new ConexionMySQL();

    public void agregarLibro(int idGenero, int idEditorial, int idIdioma, String nombreLibro, int cantidad, double costo) {
        Connection addConn = conn.abrirConexion();

        try {
            String storedProcedure = "{CALL insertLibro(?, ?, ?, ?, ?, ?)}";
            CallableStatement cs = addConn.prepareCall(storedProcedure);
            cs.setString(1, nombreLibro);
            cs.setInt(2, idGenero);
            cs.setInt(3, idEditorial);
            cs.setInt(4, idIdioma);
            cs.setInt(5, cantidad);
            cs.setDouble(6, costo);

            cs.executeUpdate();

            // Verificar el resultado del Stored Procedure
            int updateCount = cs.getUpdateCount();

            if (updateCount > 0) {
                JOptionPane.showMessageDialog(null, "Libro agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el libro.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }
    }
}

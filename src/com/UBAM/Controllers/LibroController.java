/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Controllers;

import com.UBAM.ConexionMySQL.ConexionMySQL;
import com.UBAM.Models.Libros;
import com.UBAM.Models.LibrosTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    
    public void modificarLibro(int idLibro, int idGenero, int idEditorial, int idIdioma, String nombreLibro, double costo) {
        Connection updateConn = conn.abrirConexion();

        try {
            String storedProcedure = "{CALL updateLibro(?, ?, ?, ?, ?, ?)}";
            CallableStatement cs = updateConn.prepareCall(storedProcedure);
            cs.setInt(1, idLibro);
            cs.setString(2, nombreLibro);
            cs.setInt(3, idGenero);
            cs.setInt(4, idEditorial);
            cs.setInt(5, idIdioma);
            cs.setDouble(6, costo);

            cs.executeUpdate();

            // Verificar el resultado del Stored Procedure
            ResultSet rs = cs.getResultSet();
            if (rs.next()) {
                String resultado = rs.getString("Resultado");
                JOptionPane.showMessageDialog(null, resultado);
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el libro.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }
    }
    
    public void realizarVenta(int libroId, int cantidadVenta) {
        Connection updateConn = conn.abrirConexion();

        try {
            String storedProcedure = "{CALL ventaLibro(?, ?)}";
            CallableStatement cs = updateConn.prepareCall(storedProcedure);
            cs.setInt(1, libroId);
            cs.setInt(2, cantidadVenta);

            cs.executeUpdate();

            // Verificar el resultado del Stored Procedure
            ResultSet rs = cs.getResultSet();
            if (rs.next()) {
                String resultado = rs.getString("Resultado");
                JOptionPane.showMessageDialog(null, resultado);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo realizar la venta.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }
    }
    
    public void consultaLibros(JTable jTable) {
        Connection connection = conn.abrirConexion();
        try {
            CallableStatement cs = connection.prepareCall("{CALL showAllLibros()}");
            ResultSet rs = cs.executeQuery();

            List<Libros> librosList = new ArrayList<>();
            while (rs.next()) {
                Libros libro = new Libros();
                libro.setLibro_Id(rs.getInt("libro_Id"));
                libro.setLibro_Nombre(rs.getString("libro_Nombre"));
                libro.setGenero(rs.getString("Genero"));
                libro.setEditorial(rs.getString("Editorial"));
                libro.setIdioma(rs.getString("Idioma"));
                libro.setLibro_Cantidad(rs.getInt("libro_Cantidad"));
                libro.setLibro_Costo(rs.getDouble("libro_Costo"));
                // Agrega más líneas según tus atributos

                librosList.add(libro);
            }

            LibrosTableModel modelo = new LibrosTableModel(librosList);
            jTable.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            conn.cerrarConexion();
        }
    }

}

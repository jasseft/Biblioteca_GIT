/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.ConexionMySQL;


import java.sql.*;


/**
 *
 * @author jasse
 */
public class ConexionMySQL {
    Connection conn = null;
    String url = "jdbc:mysql://localhost/git_biblioteca";
    String user = "jason";
    String pass = "1234";
    
    public Connection abrirConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
            
            if (conn != null){
                System.out.println("Conectado a: " + url);
            }else{
                System.out.println("ERROR DE CONEXION = (!!!!)");
            }
        }catch(Exception e){
            System.out.println("Error en: " + e);
        }
        return conn;
    }
    
    public void cerrarConexion(){
        try{
            conn.close();
        }catch(Exception e){
            System.out.println("Error en: " + e);
        }
    }
}


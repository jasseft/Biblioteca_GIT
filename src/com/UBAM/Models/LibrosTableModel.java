/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Models;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class LibrosTableModel extends AbstractTableModel {
    private final List<Libros> librosList;
    private final String[] columnNames = {"ID", "Nombre", "Genero", "Editorial", "Idioma", "Cantidad", "Costo"};

    public LibrosTableModel(List<Libros> librosList) {
        this.librosList = librosList;
    }

    @Override
    public int getRowCount() {
        return librosList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Libros libro = librosList.get(rowIndex);
        switch (columnIndex) {
            case 0: return libro.getLibro_Id();
            case 1: return libro.getLibro_Nombre();
            case 2: return libro.getGenero();
            case 3: return libro.getEditorial();
            case 4: return libro.getIdioma();
            case 5: return libro.getLibro_Cantidad();
            case 6: return libro.getLibro_Costo();
            default: return null;
        }
    }
}


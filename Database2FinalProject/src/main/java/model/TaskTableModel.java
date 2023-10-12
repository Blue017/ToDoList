/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author GHOST
 */
import javax.swing.table.DefaultTableModel;

public class TaskTableModel extends DefaultTableModel {
    public TaskTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        // Personaliza las clases de columna si es necesario
        switch (columnIndex) {
            case 0:
                return String.class; // Nombre
            case 1:
                return String.class; // Fecha de inicio
            case 2:
                return String.class; // Fecha de finalización
            case 3:
                return String.class; // Descripción
            case 4:
                return String.class; // Estado
            default:
                return Object.class; // Otras columnas (si las tienes)
        }
    }
}

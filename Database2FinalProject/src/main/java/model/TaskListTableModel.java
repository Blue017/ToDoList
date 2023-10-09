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

public class TaskListTableModel extends DefaultTableModel {
    public TaskListTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1) {
            return String.class; // Columna de descripción
        }
        return super.getColumnClass(columnIndex);
    }
}
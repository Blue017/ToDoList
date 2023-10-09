/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author GHOST
 */
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class listModel {

    private DefaultListModel<String> listModel;
    private JList<String> taskList;

    public listModel() {
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
    }

    public DefaultListModel<String> getListModel() {
        return listModel;
    }

    public JList<String> getTaskList() {
        return taskList;
    }

    public void addTask(String task) {
        listModel.addElement(task);
    }

    public void removeTask(String task) {
        listModel.removeElement(task);
    }

    public void clearTasks() {
        listModel.clear();
    }
}

package org.mainjava;

import javax.swing.JFrame;
import ui.LoginUI;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del JFrame LoginUI
        LoginUI loginFrame = new LoginUI();
        
        // Establecer el tamaño fijo
        loginFrame.setSize(800, 500); // Reemplaza 'ancho' y 'alto' con los valores deseados
        
        // Centrar la ventana en la pantalla
        loginFrame.setLocationRelativeTo(null);
        
        // Deshabilitar la opción de maximizar
        loginFrame.setResizable(false);
        
        // Hacer visible el JFrame LoginUI
        loginFrame.setVisible(true);
        
        // Establecer la operación predeterminada de cierre
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
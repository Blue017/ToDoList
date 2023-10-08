package org.mainjava;

import javax.swing.JFrame;
import ui.LoginUI;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del JFrame LoginUI
        LoginUI loginFrame = new LoginUI();
        
        // Hacer visible el JFrame LoginUI
        loginFrame.setVisible(true);
        
        // Establecer la operación predeterminada de cierre
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
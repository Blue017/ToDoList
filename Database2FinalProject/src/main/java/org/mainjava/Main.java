package org.mainjava;

import javax.swing.JFrame;
import ui.LoginUI;

public class Main {
    public static void main(String[] args) {
        LoginUI loginFrame = new LoginUI();
        
        loginFrame.setSize(800, 500);
        
        loginFrame.setLocationRelativeTo(null);
        
        loginFrame.setResizable(false);
        
        loginFrame.setVisible(true);
        
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

/**
 *
 * @author GHOST
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationValidator {

    public static boolean validateFields(String fullName, String username, String password, String confirmPassword, String email) {
        // Verificar campos vacíos
        if (fullName.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || email.isEmpty()) {
            return false;
        }

        // Verificar si las contraseñas coinciden
        if (!password.equals(confirmPassword)) {
            return false;
        }

        // Verificar fortaleza de la contraseña (al menos un número, una minúscula, una mayúscula y un símbolo)
        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            return false;
        }

        // Verificar el formato del correo electrónico
        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        pattern = Pattern.compile(emailPattern);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

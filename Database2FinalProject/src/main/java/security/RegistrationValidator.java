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
        return isFullNameValid(fullName) &&
               isUsernameValid(username) &&
               isPasswordValid(password) &&
               arePasswordsMatching(password, confirmPassword) &&
               isEmailValid(email);
    }

    public static boolean isFullNameValid(String fullName) {
        return !fullName.isEmpty();
    }

    public static boolean isUsernameValid(String username) {
        return !username.isEmpty();
    }

    public static boolean isPasswordValid(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$");
    }

    public static boolean arePasswordsMatching(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    public static boolean isEmailValid(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}

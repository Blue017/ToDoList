package security;

import org.bson.types.ObjectId; // Importa la clase ObjectId desde la librería de MongoDB

public class SessionManager {
    private static String loggedInUsername;
    private static ObjectId loggedInUserId; // Cambiado a ObjectId para almacenar el ObjectId del usuario logueado

    public static void setLoggedInUsername(String username) {
        loggedInUsername = username;
    }

    public static String getLoggedInUsername() {
        return loggedInUsername;
    }

    // Métodos para manejar el ObjectId del usuario logueado
    public static void setLoggedInUserId(ObjectId userId) {
        loggedInUserId = userId;
    }

    public static ObjectId getLoggedInUserId() {
        return loggedInUserId;
    }
}

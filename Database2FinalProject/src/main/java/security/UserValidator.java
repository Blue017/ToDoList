package security;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class UserValidator {

    private final MongoDatabase database;

    public UserValidator(MongoDatabase database) {
        this.database = database;
    }

    public boolean validateUser(String username, String password) {
        MongoCollection<Document> userCollection = database.getCollection("users");

        Document query = new Document("userName", username)
                .append("password", password);

        try {
            Document user = userCollection.find(query).first();
            return user != null;
        } catch (Exception e) {
            System.err.println("Error al validar al usuario: " + e.getMessage());
            return false;
        }
    }
    public Document getUserDocumentByUsername(String username) {
    MongoCollection<Document> userCollection = database.getCollection("users");

    Document query = new Document("userName", username);

    try {
        return userCollection.find(query).first();
    } catch (Exception e) {
        System.err.println("Error al obtener el documento del usuario por nombre de usuario: " + e.getMessage());
        return null;
    }
}
}

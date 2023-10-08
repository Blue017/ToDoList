/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

/**
 *
 * @author GHOST
 */

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import database.MongoDBConnection;
import org.bson.Document;

public class UserDAO {
    private static final String COLLECTION_NAME = "users";

    public void insertUser(String fullName, String username, String hashedPassword, String email) {
        MongoDatabase database = MongoDBConnection.getDatabase();
        MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

        Document user = new Document("fullName", fullName)
                .append("userName", username)
                .append("password", hashedPassword)
                .append("email", email);

        collection.insertOne(user);
    }

}
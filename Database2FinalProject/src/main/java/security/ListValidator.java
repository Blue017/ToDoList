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
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class ListValidator {
    private final MongoCollection<Document> taskListCollection;

    public ListValidator(MongoCollection<Document> taskListCollection) {
        this.taskListCollection = taskListCollection;
    }

    public boolean isListNameUnique(String listName, String username) {
        Document query = new Document("userName", username).append("listName", listName);
        MongoCursor<Document> cursor = taskListCollection.find(query).iterator();
        return !cursor.hasNext(); // Si no hay documentos que coincidan, el nombre de la lista es único
    }
}

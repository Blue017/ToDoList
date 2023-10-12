/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static database.MongoDBConnection.connect;
import static database.MongoDBConnection.getDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Task;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author GHOST
 */
public class TaskDAO {
    private MongoCollection<Document> taskCollection;
    
public List<Task> getTasksByListId(ObjectId listId) {
    List<Task> tasks = new ArrayList<>();

    try (MongoClient mongoClient = connect()) {
        MongoDatabase database = getDatabase();
        MongoCollection<Document> taskCollection = database.getCollection("tasks");

        // Busca todas las tareas con el campo "listId" igual al valor proporcionado
        try (MongoCursor<Document> cursor = taskCollection.find(Filters.eq("listId", listId)).iterator()) {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                ObjectId taskId = document.getObjectId("_id");
                String name = document.getString("name");
                Date startDate = document.getDate("startDate");
                Date endDate = document.getDate("endDate");
                String description = document.getString("description");
                String status = document.getString("status");

                Task task = new Task(name, startDate, endDate, description, status);
                tasks.add(task);
            }
        }
    }

    return tasks;
}
}

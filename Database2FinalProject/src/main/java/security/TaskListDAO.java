/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

/**
 *
 * @author GHOST
 */
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import database.MongoDBConnection;
import java.util.ArrayList;
import java.util.List;
import model.TaskList;
import org.bson.Document;
import org.bson.types.ObjectId;

public class TaskListDAO {
    private final MongoDatabase database;
    private final MongoCollection<Document> taskListCollection;

    public TaskListDAO() {
        database = MongoDBConnection.getDatabase();
        taskListCollection = database.getCollection("TaskList");
    }

    public void insertTaskList(String listName, String description, ObjectId userId) {
        Document taskListDocument = new Document();
        taskListDocument.append("userId", userId);
        taskListDocument.append("listName", listName);
        taskListDocument.append("description", description);

        taskListCollection.insertOne(taskListDocument);
    }

    public List<TaskList> getListasDeTareasPorUsuario(String username) {
        List<TaskList> listasDeTareas = new ArrayList<>();

        Document query = new Document("userName", username);
        FindIterable<Document> results = taskListCollection.find(query);

        try (MongoCursor<Document> cursor = results.iterator()) {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                String listName = document.getString("listName");
                String description = document.getString("description");
                
                TaskList listaDeTareas = new TaskList(listName, description);
                listasDeTareas.add(listaDeTareas);
            }
        }

        return listasDeTareas;
    }
    
    public boolean checkIfListExists(String listName, ObjectId userId) {
        Document query = new Document("userId", userId).append("listName", listName);
        return taskListCollection.countDocuments(query) > 0;
    }



}

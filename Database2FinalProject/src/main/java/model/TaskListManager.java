package model;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import database.MongoDBConnection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.bson.Document;

public class TaskListManager {
    private final JList<String> taskListJList;
    private final DefaultListModel<String> listModel;
    private final String loggedInUsername; // Nuevo campo para almacenar el nombre de usuario
    
    public TaskListManager(JList<String> taskListJList, String loggedInUsername) {
        this.taskListJList = taskListJList;
        this.listModel = new DefaultListModel<>();
        this.taskListJList.setModel(listModel);
        this.loggedInUsername = loggedInUsername; // Inicializa el nombre de usuario
    }
    
    public void refreshTaskLists() {
        listModel.clear();
        if (loggedInUsername != null) {
            List<String> userTaskLists = fetchUserTaskListsFromDatabase(loggedInUsername);
            for (String taskList : userTaskLists) {
                listModel.addElement(taskList);
            }
        }
    }
    
    private List<String> fetchUserTaskListsFromDatabase(String username) {
        List<String> taskLists = new ArrayList<>();
        
        try {
            MongoDatabase database = MongoDBConnection.getDatabase();
            
            MongoCollection<Document> taskListCollection = database.getCollection("TaskList");
            
            Document filter = new Document("userName", username);
            
            FindIterable<Document> result = taskListCollection.find(filter);
            
            // Itera sobre los documentos resultantes y agrega los nombres de las listas de tareas a la lista taskLists
            for (Document document : result) {
                String listName = document.getString("listName");
                taskLists.add(listName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return taskLists;
    }
}

package database;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static final String MONGODB_URI = "mongodb+srv://carlosGG:16LSZHC9riwyKF3K@cluster0.jwjnejd.mongodb.net/?retryWrites=true&w=majority";
    private static final String DATABASE_NAME = "University";

    public static MongoClient connect() {
        return MongoClients.create(MONGODB_URI);
    }

    public static MongoDatabase getDatabase() {
        MongoClient mongoClient = connect();
        return mongoClient.getDatabase(DATABASE_NAME);
    }
}
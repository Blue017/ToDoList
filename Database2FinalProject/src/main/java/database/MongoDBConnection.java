package database;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
public class MongoDBConnection {
    private static MongoDatabase database;

        public static void connect() {
            MongoClientURI uri = new MongoClientURI("");
            MongoClient mongoClient = new MongoClient(uri);
            database = mongoClient.getDatabase("");
        }

        public static MongoDatabase getDatabase() {
            return database;
        }
    }


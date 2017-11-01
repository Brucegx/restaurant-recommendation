package db.mongodb;

import com.mongodb.MongoClientURI;

public class MongoDBUtil {
	public static final String DB_NAME = "restaurant-recommendation";
	public static final MongoClientURI uri = new MongoClientURI("mongodb://rere:48694@ds241895.mlab.com:41895/restaurant-recommendation");

}

package org.example.singleton;

public class DBConnection {
    private static DBConnection canObject;
    private DBConnection(){}

    public static DBConnection getInstance(){
        if(canObject == null) {
            synchronized (DBConnection.class) {
                if (canObject == null) {
                    canObject = new DBConnection();
                }
            }
        }
        return canObject;
    }
}

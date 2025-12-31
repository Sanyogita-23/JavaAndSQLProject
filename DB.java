package student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection connect() {
        try {
            return DriverManager.getConnection(
            	"jdbc:mysql://localhost:3306/Schools?useSSL=false&serverTimezone=UTC",
                "root",
                "admin"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

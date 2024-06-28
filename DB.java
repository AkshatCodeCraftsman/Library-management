import java.sql.Connection;
import java.sql.DriverManager;

public class DB
{
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded driver");
            System.out.println("Connected to MySQL");
            return DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=Akshat189@2003");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    }

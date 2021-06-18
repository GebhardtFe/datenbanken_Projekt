import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String user = "YourPostGresUserGoesHere";	// change according to your configuration
        String pw = "YourPasswordGoesHere"; // change according to your configuration
        String url = "jdbc:postgresql://localhost/freunde?user="+user+"&password="+pw+"&ssl=false";
        try {
            Connection conn = DriverManager.getConnection(url);

            // Your code goes here!

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

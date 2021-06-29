import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String user = "dbProject";	// change according to your configuration
        String pw = "glauben"; // change according to your configuration
        String url = "jdbc:postgresql://localhost/DBProjectDataBase?user="+user+"&password="+pw+"&ssl=false";
        try {
            Connection conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
            System.out.println("T");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

package DBKlassen;

import java.sql.*;
public class Einheit {
    String bezeichnung;
    int plätze;

    public Einheit(String bezeichnung, int plätze){
        this.bezeichnung=bezeichnung;
        this.plätze=plätze;
    }

    public Einheit(ResultSet resEinheit){
        try {
            this.bezeichnung = resEinheit.getString("bezeichnung");
            this.plätze = resEinheit.getInt("plätze");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertEinheit(Connection connection){
        String sql = "insert into pg_tables@einheit values(`"+bezeichnung+"`,`"+plätze+"`);";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

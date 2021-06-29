import java.sql.*;
public class Preis{
    Date vonDatum;
    Date bisDatum;
    String pensionsart;

    public Preis(Date vonDatum, Date bisDatum, String pensionsart){
        this.vonDatum=vonDatum;
        this.bisDatum=bisDatum;
        this.pensionsart=pensionsart;
    }
    public Preis(ResultSet resPreis){
        try {
            this.vonDatum = resPreis.getDate("vonDatum");
            this.bisDatum=resPreis.getDate("bisDatum");
            this.pensionsart=resPreis.getString("pensionsart");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertPreis(Connection connection){
        String sql = "insert into pg_tables@preis values(`"+vonDatum+"`,`"+bisDatum+"`,`"+pensionsart+"`);";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
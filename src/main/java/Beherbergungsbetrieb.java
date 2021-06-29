import java.sql.*;
public class Beherbergungsbetrieb {
    int id;
    String name;
    String website;
    String typ;

    public Beherbergungsbetrieb(int id, String name, String website, String typ){
        this.id=id;
        this.name=name;
        this.website=website;
        this.typ=typ;
    }
    public Beherbergungsbetrieb(ResultSet resBeherbergungsbetrieb){

        try {
            this.id = resBeherbergungsbetrieb.getInt("id");
            this.name = resBeherbergungsbetrieb.getString("name");
            this.website = resBeherbergungsbetrieb.getString("website");
            this.typ = resBeherbergungsbetrieb.getString("typ");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void insertBeherbergungsbetrieb(Connection connection){
        String sql = "insert into pg_tables@beherbergungsbetrieb values(`"+id+"`,`"+name+"`,`"+website+"`,`"+typ+"`);";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

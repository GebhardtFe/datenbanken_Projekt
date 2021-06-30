package DBKlassen;

import java.sql.*;
public class Gast {
    String vorname;
    String nachname;
    String titel;
    String geburtsdatum;
    int svnr;

    public Gast(String vorname, String nachname, String titel, String geburtsdatum, int svnr){
        this.vorname=vorname;
        this.nachname=nachname;
        this.titel=titel;
        this.geburtsdatum=geburtsdatum;
        this.svnr=svnr;
    }

    public Gast(ResultSet resGast){

        try {
            this.vorname = resGast.getString("vorname");
            this.nachname = resGast.getString("nachname");
            this.titel = resGast.getString("titel");
            this.geburtsdatum = resGast.getString("geburtsdatum");
            this.svnr= resGast.getInt("snvr");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertGast(Connection connection){
        String sql = "insert into pg_tables@gast values(`"+svnr+"`,`"+vorname+"`,`"+nachname+"`,`"+titel+"`,`"+geburtsdatum+");";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

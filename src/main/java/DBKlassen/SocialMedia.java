package DBKlassen;

import java.sql.*;
public class SocialMedia {
    String typ;
    String benutzername;
    String passwort;

    public SocialMedia(String typ, String benutzername, String passwort){
        this.typ=typ;
        this.benutzername=benutzername;
        this.passwort=passwort;
    }
    public SocialMedia(ResultSet resSocialmedia){

        try {
            this.typ = resSocialmedia.getString("typ");
            this.benutzername = resSocialmedia.getString("benutzername");
            this.passwort = resSocialmedia.getString("passwort");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertSocialMedia(Connection connection){
        String sql = "insert into pg_tables@socialmedia values(`"+benutzername+"`,`"+passwort+"`,`"+typ+"`);";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

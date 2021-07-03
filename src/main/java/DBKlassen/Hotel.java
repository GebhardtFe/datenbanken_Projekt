package DBKlassen;

import DBKlassen.Beherbergungsbetrieb;

import java.sql.*;
public class Hotel extends Beherbergungsbetrieb {
    int anzahlSterne;
    Adresse adresse;

    public Hotel(int anzahlSterne, int id, String name, String website, String typ, Adresse adresse){
        super(id, name, website, typ, adresse);
        this.anzahlSterne=anzahlSterne;
    }
    public Hotel(ResultSet resHotel){
        super(resHotel);
        try {
            this.anzahlSterne = resHotel.getInt("anzahlSterne");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertHotel(Connection connection){
        String sql = "insert into pg_tables@hotel values(`"+super.id+"`,`"+super.name+"`,`"+super.website+"`,`"+super.typ+"`,`"+super.typ+"`,`"+anzahlSterne+");";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
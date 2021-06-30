package DBKlassen;

import java.sql.*;
public class Buchung{
    Date anreisetag;
    Date abreisetag;
    int buchungsNr;

    public Buchung(Date anreisetag, Date abreisetag, int buchungsNr){
        this.anreisetag=anreisetag;
        this.anreisetag=anreisetag;
        this.buchungsNr=buchungsNr;
    }
    public Buchung(ResultSet resBuchung){
        try {
            this.anreisetag = resBuchung.getDate("anreisetag");
            this.abreisetag=resBuchung.getDate("abreisetag");
            this.buchungsNr=resBuchung.getInt("buchungsNr");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertBuchung(Connection connection){
        String sql = "insert into pg_tables@buchung values(`"+buchungsNr+"`,`"+anreisetag+"`,`"+abreisetag+"`);";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
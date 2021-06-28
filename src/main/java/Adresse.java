public class Adresse{
    int plz;
    String stadt;
    String straße;
    int hausnummer;
    String land;


    public Adresse(int plz, String stadt, String straße, int hausnummer, String land){
        this.plz=plz;
        this.stadt=stadt;
        this.straße=straße;
        this.hausnummer=hausnummer;
        this.land=land;
    }
    public Adresse(ResultSet resAdresse){
        try {
            this.plz=resAdresse.getInt("plz");
            this.stadt=resAdresse.getString("stadt");
            this.straße=resAdresse.getString("straße");
            this.hausnummer=resAdresse.getInt("hausnummer");
            this.land=resAdresse.getString("land");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
public class Hotel{
    int anzahlSterne;

    public Hotel(int anzahlSterne){
        this.anzahlSterne=anzahlSterne;
    }
    public Hotel(ResultSet resHotel){
        try {
            this.anzahlSterne = resHotel.getInt("anzahlSterne");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
public class Kontaktdaten{
    String telefon;
    String email;
    String fax;

    public Kontaktdaten(String telefon, String email, String fax){
        this.telefon=telefon;
        this.email=email;
        this.fax=fax;
    }
    public Kontaktdaten(ResultSet resKontaktdaten){
        try {
            this.telefon = resKontaktdaten.getString("telefon");
            this.email= resKontaktdaten.getString("email");
            this.fax=resKontaktdaten.getString("fax");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
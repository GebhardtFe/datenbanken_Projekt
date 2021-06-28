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
}

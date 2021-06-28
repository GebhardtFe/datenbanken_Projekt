public class Einheit {
    String bezeichnung;
    int plätze;

    public Einheit(String bezeichnung, int plätze){
        this.bezeichnung=bezeichnung;
        this.plätze=plätze;
    }

    public Einheit(ResultSet reseinheit){
        try {
            this.bezeichnung = reseinheit.getString("bezeichnung");
            this.plätze = reseinheit.getInt("plätze");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

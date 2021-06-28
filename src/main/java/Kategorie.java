public class Kategorie {
    String bezeichnung;
    String beschreibung;
    int anzahlbetten;
    int fläche;
    int kategorienr;

    public Kategorie(String bezeichnung, String beschreibung, int anzahlbetten, int fläche, int kategorienr){
        this.bezeichnung=bezeichnung;
        this.beschreibung=beschreibung;
        this.anzahlbetten=anzahlbetten;
        this.fläche=fläche;
        this.kategorienr=kategorienr;
    }

    public Kategorie(ResultSet reskategorie){

        try {
            this.bezeichnung = reskategorie.getString("bezeichnung");
            this.beschreibung = reskategorie.getString("beschreibung");
            this.anzahlbetten = reskategorie.getInt("anzahlbetten");
            this.fläche = reskategorie.getInt("fläche");
            this.kategorienr=reskategorie.getInt("kategorienr");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

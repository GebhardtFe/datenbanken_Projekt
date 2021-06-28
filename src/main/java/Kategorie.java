public class Kategorie {
    String bezeichnung;
    String beschreibung;
    int anzahlbetten;
    int fläche;
    int kategorieNr;

    public Kategorie(String bezeichnung, String beschreibung, int anzahlbetten, int fläche, int kategorieNr){
        this.bezeichnung=bezeichnung;
        this.beschreibung=beschreibung;
        this.anzahlbetten=anzahlbetten;
        this.fläche=fläche;
        this.kategorieNr=kategorieNr;
    }

    public Kategorie(ResultSet resKategorie){

        try {
            this.bezeichnung = resKategorie.getString("bezeichnung");
            this.beschreibung = resKategorie.getString("beschreibung");
            this.anzahlbetten = resKategorie.getInt("anzahlbetten");
            this.fläche = resKategorie.getInt("fläche");
            this.kategorieNr=resKategorie.getInt("kategorieNr");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

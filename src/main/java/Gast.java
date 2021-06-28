public class Gast {
    String vorname;
    String nachname;
    String titel;
    String geburtsdatum;
    int svnr;

    public Gast(String vorname, String nachname, String titel, String geburtsdatum, int svnr){
        this.vorname=vorname;
        this.nachname=nachname;
        this.titel=titel;
        this.geburtsdatum=geburtsdatum;
        this.svnr=svnr;
    }

    public Gast(ResultSet resGast){

        try {
            this.vorname = resGast.getString("vorname);
            this.nachname = resGast.getString("nachname");
            this.titel = resGast.getString("titel");
            this.geburtsdatum = resGast.getString("geburtsdatum");
            this.svnr= resGast.getInt("snvr");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

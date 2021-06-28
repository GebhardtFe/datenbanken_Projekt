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

    public Gast(ResultSet resgast){

        try {
            this.vorname = resgast.getString("vorname);
            this.nachname = resgast.getString("nachname");
            this.titel = resgast.getString("titel");
            this.geburtsdatum = resgast.getDate("geburtsdatum");
            this.svnr= resgast.getInt("snvr");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

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
}
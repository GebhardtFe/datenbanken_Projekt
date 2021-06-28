public class Preis{
    Date vonDatum;
    Date bisDatum;
    Enum pensionsart;

    public Preis(Date vonDatum, Date bisDatum, Enum pensionsart){
        this.vonDatum=vonDatum;
        this.bisDatum=bisDatum;
        this.pensionsart=pensionsart;
    }
    public Preis(ResultSet resPreis){
        try {
            this.vonDatum = resPreis.getDate("vonDatum");
            this.bisDatum=resPreis.getDate("bisDatum");
            this.pensionsart=resPreis.getEnum("pensionsart");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
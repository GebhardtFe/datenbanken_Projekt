public class Beherbergungsbetrieb {
    int id;
    String name;
    String website;
    enum typ;

    public Beherberungsbetrieb(int id, String name, String website, enum typ){
        this.id=id;
        this.name=name;
        this.website=website;
        this.typ=typ;
    }
    public Beherbergungsbetrieb(ResultSet resBeherbergungsbetrieb){

        try {
            this.id = resBeherbergungsbetrieb.getInt("id");
            this.name = resBeherbergungsbetrieb.getString("name");
            this.website = resBeherbergungsbetrieb.getString("website");
            this.typ = resBeherbergungsbetrieb.getEnum("typ");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

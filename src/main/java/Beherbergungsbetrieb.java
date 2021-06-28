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
    public Beherbergungsbetrieb(ResultSet result){

        try {
            this.id = result.getInt("id");
            this.name = result.getString("name");
            this.website = result.getString("website");
            this.typ = result.getEnum("typ");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

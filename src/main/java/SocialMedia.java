public class SocialMedia {
    Enum typ;
    String benutzername;
    String passwort;

    public SocialMedia(Enum typ, String benutzername; String passwort){
        this.typ=typ;
        this.benutzername=benutzername;
        this.passwort=passwort;
    }
    public SocialMedia(ResultSet resSocialmedia){

        try {
            this.typ = resSocialmedia.getEnum("typ");
            this.benutzername = resSocialmedia.getString("benutzername");
            this.passwort = resSocialmedia.getString("passwort");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}

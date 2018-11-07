public class Gamer {

    private String gamertag;

    public Gamer(String gamertag){
        this.gamertag=gamertag;

    }

    public String turn(){
        return ""+gamertag;
    }

    public String toString() {
        return gamertag;
    }
}

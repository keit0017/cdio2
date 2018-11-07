public class Player {

    private String gamertag;

    public Player(String gamertag){
        this.gamertag=gamertag;

    }

    public String turn(){
        return ""+gamertag;
    }

    public String toString() {
        return gamertag;
    }
}

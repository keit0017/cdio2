package Game;

public class Player {

    private String gamertag;

    public Player(String gamertag){
        this.gamertag=gamertag;

    }

    public String turn(){
        return "Din tur"+gamertag;
    }

    public String toString() {
        return gamertag;
    }
}

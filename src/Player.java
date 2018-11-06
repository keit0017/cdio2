public class Player {
    private int points= 0;

    public int addPoints(int added){
        points+=added;
        return points;
    }

    public int getPoints(){
        return points;
    }

    public int subtractPoints(int removed){
        points-=removed;
        return points;
    }

    public int restartPoints(){
        points=0;
        return points;
    }




}

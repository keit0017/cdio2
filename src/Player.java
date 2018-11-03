public class Player {
    int points= 0;

    public int addpoints(int added){
        points+=added;
        return points;
    }

    public int getPoints(){
        return points;
    }

    public int subtractpoints(int removed){
        points-=removed;
        return points;
    }

    public int restartpoints(){
        points=0;
        return points;
    }




}

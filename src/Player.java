public class Player {

    //int for amount of money in account
    private int points= 1000;

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
        points=1000;
        return points;
    }




}

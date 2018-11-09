package Game;

public class FieldList {

    /*
    The FieldList manages the values to be added or subtracted from the players account,
    depending on the result of the two Dice rolls.
     */
    public int field(int result)
    {
        int field = 0;
        switch (result)
        {
            case 2: field = 250;
                break;
            case 3: field = -100;
                break;
            case 4: field = 100;
                break;
            case 5: field = -20;
                break;
            case 6: field = 180;
                break;
            case 7: field = 0;
                break;
            case 8: field = -70;
                break;
            case 9: field = 60;
                break;
            case 10: field = -80;
                break;
            case 11: field = -50;
                break;
            case 12: field = 650;
                break;
        }
        return field;
    }
}

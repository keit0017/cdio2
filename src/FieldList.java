public class FieldList {

    private Dice D1;
    private Dice D2;

    public FieldList()
    {
        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6);
        D1 = d1;
        D2 = d2;
    }

    public String field()
    {
        int result = D1.roll() + D2.roll();

        switch (result)
        {
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            case 8:break;
            case 9:break;
            case 10:break;
            case 11:break;
            case 12:break;
        }
    }
}

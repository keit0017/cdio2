package Test;

import Game.Account;
import Game.Dice;

import static org.junit.Assert.*;

public class AccountTest {

    // Test to ensure that the points in Account can never be negative.
    @org.junit.Test
    public void getPoints() {
        Account account = new Account();
        account.addPoints(-1100);
        assertTrue(account.getPoints() == 0);
    }

    // Test to see if the two dice follow the correct distribution.
    @org.junit.Test
    public void testDice() {
        int two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0, twelve = 0, same = 0;
        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6);

        for (int i = 0; i < 1000; i++) {
            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int result = roll1 + roll2;

            if(roll1 == roll2){
                same++;
            }

            switch (result){
                case 2: two++;
                    break;
                case 3: three++;
                    break;
                case 4: four++;
                    break;
                case 5: five++;
                    break;
                case 6: six++;
                    break;
                case 7: seven++;
                    break;
                case 8: eight++;
                    break;
                case 9: nine++;
                    break;
                case 10: ten++;
                    break;
                case 11: eleven++;
                    break;
                case 12: twelve++;
                    break;
            }

            assertTrue(2 <= result && result <= 12);
        }
        System.out.println("twos: " + two + "\nthrees: " + three + "\nfours: " + four +
                "\nfives: " + five + "\nsixes: " + six + "\nsevens: " + seven + "\neights: " + eight
                + "\nnines: " + nine + "\ntens: " + ten + "\nelevens: " + eleven + "\ntwelves: " + twelve + "\nsame: " + same);
    }
}
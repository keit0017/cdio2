package Game;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int language, turn = 1;
        int gaming, result = 0;
        String gamertag1, gamertag2;
        boolean choosegamertag = false;
        boolean lang_factor = false;
        boolean game = true;
        boolean roll = true;
        Language lang = new Language();
        Scanner scan = new Scanner(System.in);
        Dice d1 = new Dice(6);
        Dice d2 = new Dice(6);
        FieldList fieldList = new FieldList();

        System.out.print("vælg 1 for dansk:  choose 2 for english: ");
// A while loop that makes it possible for the user to choose a language. Uses a method from our Language class.
        while (!lang_factor) {
            language = scan.nextInt();
            scan.nextLine();
            if (language == 1) {
                lang.chooseLang(language);
                lang_factor = true;
            } else if (language == 2) {
                lang.chooseLang(language);
                lang_factor = true;
            } else {
                System.out.println("This is not a valid answer. vølg 1 for dansk:  choose 2 for english:");

            }
        }
//Creates two player objects. The user names the objects by using the scanner.
        System.out.print("navngiv spiller 1: ");
        String name = scan.nextLine();
        Account account1 = new Account();
        Player player1 = new Player(name);
        System.out.print("navngiv spiller 2: ");
        name = scan.nextLine();
        Account account2 = new Account();
        Player player2 = new Player(name);

// The game loop. Rolls the dice and puts it into the result variable.

        while (game) {
            System.out.print(lang.message(1));
            while (roll) {
                gaming = scan.nextInt();
                if (gaming == 1) {
                    result = d1.roll() + d2.roll();
                    roll = false;
                } else if (gaming != 1) {
                    System.out.print(lang.message(13));

                }
            }
            // Uses the result in Language methods, to print out the messages that belongs to the different fields.
            // The fieldlist also uses the result variable so we can add/substract the correct amount of points to an account
            //the fieldlist method is inside of the add points to an account method, from the Account class.
            System.out.println(lang.message(result));
            if (turn % 2 != 0) { // The system divides turn by 2 and if the rest is anything but zero, it's player 1's turn.
                                // otherwise it's player 2's turn.
                account1.addPoints(fieldList.field(result));
                System.out.println(player1.toString()+": "+account1.getPoints()+" points");
            } else {
                account2.addPoints(fieldList.field(result));
                System.out.println(player2.toString()+": "+account2.getPoints()+" points");
            }
            // if result = 10 then the user gets an extra turn. We run dice roll, message printout and add points method again
            if (result == 10) {
               roll = true;
                while (roll) {
                    System.out.print(lang.message(1));
                    gaming = scan.nextInt();
                    if (gaming == 1) {
                        result = d1.roll() + d2.roll();
                        roll = false;
                    } else if (gaming != 1) {
                        System.out.print(lang.message(13));

                    }
                }
                System.out.println(lang.message(result));
                if (turn % 2 != 0) {
                    account1.addPoints(fieldList.field(result));
                    System.out.println(player1.toString()+": "+account1.getPoints()+" points");
                } else {
                    account2.addPoints(fieldList.field(result));
                    System.out.println(player2.toString()+": "+account2.getPoints()+" points");

                }
            }
                roll = true; // roll is set to true again, so the while loop can continue.
                turn++; // we add 1 to turn. It makes the system able to switch between the two players.
            // the win condition. If one of the accounts = 3000 that player wins.
                if (account1.getPoints() >= 3000) {
                    System.out.println(player1.toString()+lang.message(14));

                } else if (account2.getPoints() >= 3000){
                    System.out.println(player2.toString()+lang.message(14));
                }


        }
    }
}
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

        System.out.print("navngiv spiller 1: ");
        String name = scan.nextLine();
        Account account1 = new Account();
        Player player1 = new Player(name);
        System.out.print("navngiv spiller 2: ");
        name = scan.nextLine();
        Account account2 = new Account();
        Player player2 = new Player(name);

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
            System.out.println(lang.message(result));
            if (turn % 2 != 0) {
                account1.addPoints(fieldList.field(result));
                System.out.println(account1.getPoints());
            } else {
                account2.addPoints(fieldList.field(result));
                System.out.println(account2.getPoints());
            }
            if (result == 10) {
                while (roll) {
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
                    System.out.println(account1.getPoints());
                } else {
                    account2.addPoints(fieldList.field(result));
                    System.out.println(account2.getPoints());

                }
                roll = true;
                turn++;
                if (account1.getPoints() == 3000 || account2.getPoints() == 3000) {
                    game = false;
                }
            }

        }
    }
}
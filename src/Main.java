import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

    int language;
    int gaming;
    String gamertag1, gamertag2;
    boolean choosegamertag = false;
    boolean lang_factor = false;
    boolean game = true;
    Language lang = new Language();
    Scanner scan = new Scanner(System.in);
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

        System.out.print("navngiv spiller 1");
        String name = scan.nextLine();
        Player player1 = new Player(name);
        System.out.print("navngiv spiller 2");
        name = scan.nextLine();
        Player player2 = new Player(name);

        while (game){

            System.out.print(lang.message(1));
            gaming = scan.nextInt();

        }
    }
}

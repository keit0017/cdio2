import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int language;
    boolean lang_factor = false;
    boolean game = true;
    Language lang = new Language();
    Scanner scan = new Scanner(System.in);

        System.out.print("Choose 1 if you want the language to be in danish or choose 2 for english: ");

        while (!lang_factor) {
            language = scan.nextInt();

            if (language == 1) {
                lang.chooseLang(language);
                lang_factor = true;
            } else if (language == 2) {
                lang.chooseLang(language);
                lang_factor = true;
            } else {
                System.out.println("This is not a valid answer. Please choose 1 for danish or 2 for english");

            }
        }
        while (game){

        }
    }
}

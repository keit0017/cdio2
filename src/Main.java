import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int language;
    boolean lang_factor = false;
    boolean game = true;
    Language lang = new Language();
    Scanner scan = new Scanner(System.in);

        System.out.print("Vælg 1 for dansk eller vælg 2 for engelsk: ");

        while (!lang_factor) {
            language = scan.nextInt();

            if (language == 1) {
                lang.chooseLang(language);
                lang_factor = true;
            } else if (language == 2) {
                lang.chooseLang(language);
                lang_factor = true;
            } else {
                System.out.println("Dette er ikke gyldigt. Vælg enten 1 for dansk eller 2 for engelsk.");

            }
        }
        while (game){

        }
    }
}

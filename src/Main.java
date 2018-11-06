import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int language;
    boolean lang_factor = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Vælg 1 for dansk eller vælg 2 for engelsk: ");

        while (lang_factor == false) {
            language = scan.nextInt();
            if (language == 1) {
                lang_factor = true;
            } else if (language == 2) {
                lang_factor = true;
            } else {
                System.out.println("Dette er ikke gyldigt. Vælg enten 1 for dansk eller 2 for engelsk.");

            }
        }

    }
}

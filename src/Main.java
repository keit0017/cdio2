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
        System.out.print("vaelg 1 for dansk:  choose 2 for english: ");

        while (!lang_factor) {
            language = scan.nextInt();

            if (language == 1) {
                lang.chooseLang(language);
                lang_factor = true;
            } else if (language == 2) {
                lang.chooseLang(language);
                lang_factor = true;
            } else {
                System.out.println("This is not a valid answer. vaelg 1 for dansk:  choose 2 for english:");

            }
        }

        String[] naming= new String[3];


        for(int i=0; i<naming.length;i++){
            naming[i]=scan.nextLine();
            System.out.println("Spiller"+i+":");

        }

        Player player1 = new Player((naming[0]));
        Player player2 = new Player((naming[1]));



        while (game){

            System.out.print("indsæt tekstfil");
            gaming = scan.nextInt();

        }
    }
}

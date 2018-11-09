package Game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Language {
    /*
    Declaration of variables:
    messages array to hold the Strings to be printed in the game.
    String file to hold the .txt file.
    int langChoice to choose between languages.
     */
    private String[] messages = new String[34];
    private String file;
    private int langChoice = 0;

    // Constructor sets the file containing the games' text.
    public Language()
    {
        String file = "language.txt";
        this.file = file;
    }

    // Chooses between languages and then loads the messages into the array.
    public void chooseLang(int choice) throws IOException {
        if (choice == 2)
        {
            langChoice = 20;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        for (int i = 0; i < messages.length; i++)
        {
            messages[i] = reader.readLine();
        }
        reader.close();
    }

    // Returns String message dependent on its place in the array.
    public String message(int msgNumber)
    {
        msgNumber -= 1;
        msgNumber += langChoice;
        String str = messages[msgNumber];
        return str;
    }
}

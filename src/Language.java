import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Language {
    private String[] messages = new String[16];
    private String file;
    private int langChoice = 0;

    public Language()
    {
        String file = "language.txt";
        this.file = file;
    }

    public void chooseLang(int choice) throws IOException {
        if (choice == 2)
        {
            langChoice = 20;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        for (int i = (0 + langChoice); i < (messages.length + langChoice); i++)
        {
            messages[i] = reader.readLine();
        }
        reader.close();
    }

    public String message(int msgNumber)
    {
        msgNumber += langChoice;
        String str = messages[msgNumber];
        return str;
    }
}

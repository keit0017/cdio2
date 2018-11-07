import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Language {
    private String[] messages = new String[10];
    private String file;

    public Language()
    {
        String file = "language.txt";
        this.file = file;
    }

    public void chooseLang(int choice) throws IOException {
        int lang = 0;
        if (choice == 2)
        {
            lang = 20;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        for (int i = (0 + lang); i < (messages.length + lang); i++)
        {
            messages[i] = reader.readLine();
        }
        reader.close();
    }

    public String message(int msgNumber)
    {
        String str = messages[msgNumber];
        return str;
    }
}

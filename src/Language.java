import java.io.BufferedReader;
import java.io.FileReader;

public class Language {
    private String[] messages = new String[10];
    private String file;

    public Language()
    {
        String file = "language.txt";
        this.file = file;
    }

    public void chooseLang(int choice)
    {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        for (int i = 0; i < messages.length; i++)
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

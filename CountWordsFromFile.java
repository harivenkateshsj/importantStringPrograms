package importantStringPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountWordsFromFile  {
    public static void main(String[] args) throws Exception
    {
        FileReader file = new FileReader("C:\\Users\\hariv\\Documents\\text.txt");
        BufferedReader br = new BufferedReader(file);
        int count = 0;
        String line;

        while((line=br.readLine())!=null)
        {
          String[] words = line.split(" ");
          count = count+words.length;
        }

        System.out.println("Number of words present in the given file " + count);

        br.close();
    }
}

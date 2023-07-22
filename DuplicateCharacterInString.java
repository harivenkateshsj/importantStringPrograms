package importantStringPrograms;
//https://www.javatpoint.com/program-to-find-the-duplicate-characters-in-a-string
public class DuplicateCharacterInString {
    public static void main(String[] args) {
        String input = "Great responsibility"; // r e t s i
        int count;
        char[] text = input.toCharArray();
        for(int i=0;i<text.length;i++)
        {
            count=1;
            for(int j=i+1;j<text.length;j++)
            {
                if(text[i]==text[j] && text[i]!=' ')
                {
                    count++;
                    text[j]='0';
                }
            }
            if(count>1 && text[i]!='0')
            {
                System.out.println(text[i]);
            }
        }

    }
}
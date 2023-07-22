package importantStringPrograms;
//https://stackoverflow.com/questions/19314228/find-positions-of-a-character-in-a-string
public class PositionOfCharacterInString {
    public static void main(String[] args)
    {
        String text = "You are awesome honey"; //1,12,17
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i) == 'o')
            {
                System.out.println(i);
            }
        }
    }
}

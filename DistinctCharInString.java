package importantStringPrograms;
import java.util.*;
  //Q: Write a program to find the distinct characters and their count in a string in Java?
//Sol: https://www.wikitechy.com/interview-questions/java/find-number-of-occurrence-of-each-of-the-unique-characters-in-a-string/
public class DistinctCharInString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        char[] strArr = str.toCharArray();

        HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();

        for(char c:strArr)
        {
            if(charMap.containsKey(c)) //if character is already present, increment value by 1
            {
                charMap.put(c,charMap.get(c)+1);
            }
            else
            {
                charMap.put(c,1);
            }
        }
        System.out.println("Distinct character and count from the given string");
        for(Map.Entry<Character, Integer> e:charMap.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
/**
 * .put(key,value): It stores the key and respective value in the map.
 * .get(key): It returns the value of the given key.
 * https://www.educative.io/answers/how-to-get-distinct-characters-and-their-count-in-a-string
 */

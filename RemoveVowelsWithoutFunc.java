package importantStringPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//https://java2blog.com/java-program-remove-vowels-string/
public class RemoveVowelsWithoutFunc {
    public static void main(String[] args)
    {
        String text;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        text = sc.nextLine();
        char[] charArray = text.toCharArray();

        Set<Character> vowels = new HashSet<Character>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        StringBuffer result = new StringBuffer();


        for(Character i:charArray)
        {
            if(!vowels.contains(i))
            {
                result.append(i);
            }
        }
        System.out.println("After removing vowels: ");
        System.out.println(result);
    }

}

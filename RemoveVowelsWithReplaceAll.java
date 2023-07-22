package importantStringPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//https://java2blog.com/java-program-remove-vowels-string/
public class RemoveVowelsWithReplaceAll {
    public static void main(String[] args)
    {
        String text;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        text = sc.nextLine();

        String result = text.replaceAll("[AEIOUaeiou]","");
        System.out.println("After removing vowels: ");
        System.out.println(result);
    }

}

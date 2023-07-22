package importantStringPrograms;
import java.util.*;
//Write a Java program to check if a vowel is present in a string
//sol: https://www.educative.io/answers/how-to-check-all-the-present-vowels-in-a-string-in-java
public class IsVowelPresent {
    public static void main(String[] args)
    {
        String inputString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String"); //I am Hari
        inputString = sc.nextLine();
        Set<Character> fruit = new HashSet();

        System.out.println("Vowels present at given string are ");
        for(int i=0;i<inputString.length();i++)
        {
            if(inputString.charAt(i)=='A' || inputString.charAt(i)=='E'|| inputString.charAt(i)=='I'|| inputString.charAt(i)=='O'|| inputString.charAt(i)=='U'|| inputString.charAt(i)=='a'|| inputString.charAt(i)=='e'|| inputString.charAt(i)=='i'|| inputString.charAt(i)=='o'|| inputString.charAt(i)=='u')
            {
              //System.out.print(inputString.charAt(i) + " "); //I a a i
              fruit.add(inputString.charAt(i));
            }
        }
        System.out.print(fruit + " "); //[a, I, i]
    }
}
//Set<Character> fruit = new HashSet<Character>();
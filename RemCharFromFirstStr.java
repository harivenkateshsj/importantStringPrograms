package importantStringPrograms;

import java.util.HashMap;
import java.util.Scanner;

//Q:Write a program to remove characters from the first String which are present in the second String?
//A:https://takeuforward.org/data-structure/remove-characters-from-first-string-present-in-the-second-string/#:~:text=Declare%20the%20hashmap%20wherein%20the,iteration%20of%20string1%20is%20over.
public class RemCharFromFirstStr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();
        System.out.println("After removing characters from the first String which are present in the second String");
        System.out.print(solution(s1,s2));
    }

    static String solution(String s1, String s2)
    {
        HashMap<Character,Integer> myMap = new HashMap<>();
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<s2.length();i++)
        {
            myMap.put(s2.charAt(i),i);
        }
        for(int i=0;i<s1.length();i++)
        {
            if(myMap.get(s1.charAt(i))==null)
            {
                ans.append(s1.charAt(i));
            }
        }
        return ans.toString();
        /*
        for(int i=0;i<s2.length();i++)
        {
            myMap.get(i);
        }
        System.out.println(myMap);
        */
    }
}

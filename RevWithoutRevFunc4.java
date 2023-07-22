package importantStringPrograms;

import java.util.Scanner;
//https://www.javatpoint.com/how-to-reserve-a-string-in-java-without-using-reverse-function
public class RevWithoutRevFunc4 {
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine();
        System.out.println("After reverse string is");
        System.out.println(reverse(s));
    }
    static String reverse(String str)
    {
        String rev="";
        for (int i = str.length(); i > 0; --i)
        {
            rev = rev + (str.charAt(i - 1));
        }
        return rev;
    }

}

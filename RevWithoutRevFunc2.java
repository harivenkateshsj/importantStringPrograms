package importantStringPrograms;

import java.util.Scanner;
//https://www.javatpoint.com/how-to-reserve-a-string-in-java-without-using-reverse-function
public class RevWithoutRevFunc2 {
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine();
        System.out.println("After reverse string is");
        int i=s.length();
        while(i>0)
        {
            System.out.print(s.charAt(i-1));
            --i;
        }

    }
}

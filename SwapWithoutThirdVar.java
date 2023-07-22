package importantStringPrograms;
//Q: program to swap two String variables without third variable.
//A: https://www.javatpoint.com/java-program-to-swap-two-string-variables-without-using-third-or-temp-variable
public class SwapWithoutThirdVar {
    public static void main(String[] args)
    {
        String first = "Hello"; //5
        String second = "World"; //5

        System.out.println("Before swapping");
        System.out.println("Value of first: " + first); //Hello
        System.out.println("Value of second: " + second); //World ; second.length()=5

        first = first+second; //HelloWorld ; first.length()=10

        second = first.substring(0,(first.length()-second.length())); // (0,(10-5)) => (0,5) so Hello

        first = first.substring(second.length()); //second.length()=5 => It store from index 5 till end

        System.out.println("After swapping");
        System.out.println("Value of first: " + first); //World
        System.out.println("Value of second: " + second); //Hello


    }
}
/***
 * Type 1:
 * substring(int startIndex, int endIndex)
 * startIndex : starting index is inclusive
 * endIndex : ending index is exclusive
 *
 * Type 2:
 * substring(int startIndex)
 * It store from startIndex till end
 * //https://www.javatpoint.com/java-string-substring
 */

package importantStringPrograms;

import java.util.*;

//Q: Write a Java Program to count the number of words in a string using HashMap.
//A: https://simple2code.com/java-programs/java-program-count-number-of-words-in-a-string-using-hashmap/
public class CountWordsInStr1 {
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine();
        String[] splitFn = str.split(" ");

        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        for(int i=0;i<splitFn.length;i++)
        {
            if(hashMap.containsKey(splitFn[i]))
            {
                int count = hashMap.get(splitFn[i]);
                hashMap.put(splitFn[i],count+1);
            }
            else
            {
                hashMap.put(splitFn[i],1);
            }
        }
        System.out.println("Count of words in String");
        System.out.println(hashMap);


    }
}
/**
 * .put(key,value): It stores the key and respective value in the map.
 * .get(key): It returns the value of the given key.
 */
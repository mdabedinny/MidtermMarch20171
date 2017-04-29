package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String first = "CAT";
        String second = "ACT";
        System.out.println(isAnagram(first, second));
    }
    public static boolean isAnagram(String first, String second){
        char[] firstWord = first.toCharArray();
        char[] secondWord = second.toCharArray();
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);
        return Arrays.equals(firstWord, secondWord);
    }

}

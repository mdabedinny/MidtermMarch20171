package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] word = st.split(" ");
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        for(String string:word){
            if(wordMap.get(string)!=null){
                wordMap.put(string, wordMap.get(string)+1);
            }else{
                wordMap.put(string, 1);
            }
        }
        Set<String> string1 = wordMap.keySet();

        for(String str:string1){
            if (wordMap.get(str)>1) {
                System.out.println(str + ":" + wordMap.get(str));

            }


        }

    }

}

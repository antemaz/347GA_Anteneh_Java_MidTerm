package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    /** INSTRUCTIONS
     * Implement a solution to find the length of the longest word in the given sentence below
     * Your solution should return a map containing the length of the word as the key & the word itself as the value
     * "10: biological"
     */

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        int bigLength = -1;
        for (Integer length:wordNLength.keySet()){
            if (length>bigLength){
                bigLength =length;
            }
        }
        String maxlength=wordNLength.get(bigLength);
        System.out.println(bigLength + " " + maxlength);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String [] lengthArray =wordGiven.split(" ");
        for (String word: lengthArray){
            map.put(word.length(), word);
        }


        return map;
    }
}
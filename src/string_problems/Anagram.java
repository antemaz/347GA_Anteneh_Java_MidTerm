package string_problems;

import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
    static void Anagram(String color1, String color2) {
       String word1=color1.replaceAll("\\s","");
        String word2=color2.replaceAll("\\s","");
        if(color1.length()!=color2.length()) {
        }
        else {
            char[]ArrayS1=word1.toLowerCase().toCharArray();
            char[]ArrayS2=word2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
        }
           System.out.println(word1+" and "+word2+" are Anagrams");
        }
    public static void main(String[]args){
        Anagram("Night","Thing");
}
    }


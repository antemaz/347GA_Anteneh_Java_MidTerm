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
    static void Anagram(String Rank1, String Rank2) {
       String string1=Rank1.replaceAll("\\s","");
        String string2=Rank2.replaceAll("\\s","");
        if(Rank1.length()!=Rank2.length()) {
        }
        else {
            char[]ArrayS1=string1.toLowerCase().toCharArray();
            char[]ArrayS2=string2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
        }
           System.out.println(string1+" and "+string2+" are Anagrams");
        }
    public static void main(String[]args){
        Anagram("Night","Thing");
}
    }


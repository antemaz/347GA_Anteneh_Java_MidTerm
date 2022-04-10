package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
String word = "Civic";
String remain = " ";
int wordLength = word.length();
for(int i =(wordLength -1); i>=0; i-=1)
    remain=remain + word.charAt(i);
if(word.toLowerCase().equals(remain.toLowerCase())) {
    System.out.println(word + " is not palindrome");
}
else{
    System.out.println(word + " is a palindrome");
}

    }
}

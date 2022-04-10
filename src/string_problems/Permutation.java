package string_problems;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    // Implement Here

    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;

        return String.valueOf(b);

    }
    public static void main(String[] args) {
        String tr = "XYZ";
        int len = tr.length();
        System.out.print("XYZ =");

        generatePermutation(tr, 0, len);
    }
    private static void generatePermutation(String tr, int start, int end) {

        if (start == end - 1)
            System.out.print("  "+tr);

        else {
            for (int i = start; i < end; i++) {
                tr = swapString(tr, start, i);

                generatePermutation(tr, start + 1, end);

                tr = swapString(tr, start, i);
            }
        }
    }
}

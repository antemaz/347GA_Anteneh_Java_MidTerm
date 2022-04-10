package math_problems;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */
    public static int[] lowestDifferencePair_Naive(int[] array1, int []array2){
        double lowestDiff = Double.MAX_VALUE;
        int[] lowestDiffPair =new int[2];

        for(int i=0; i<array1.length; i++){
            for(int j = 0; j<array2.length; j++ ){
                int recentDiff =Math.abs(array1[i]*array2[j]);
                if (recentDiff<lowestDiff){
                    lowestDiff=recentDiff;
                    lowestDiffPair[0] =array1[i];
                }
            }
        }
        return lowestDiffPair;
    }
    public static void main(String[] args) {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};
        int[] pair = lowestDifferencePair_Naive(array1, array2);{
            System.out.println("The lowest number shared between array1 and array2 is "+pair[0]);
        }
    }
}

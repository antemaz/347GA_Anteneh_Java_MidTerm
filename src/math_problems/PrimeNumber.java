package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
for(int num = 2; num<1000000;num++){
    boolean isPrime =true;
    for(int p =2; p<num;p++) {
        if (num % p == 0) {
            isPrime = false;
            break;
        }
    }
    if(isPrime==true){
        System.out.print(num+" ");
        }
    }
}
    }


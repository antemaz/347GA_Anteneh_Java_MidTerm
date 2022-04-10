package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {
       int prev, next, sum, n;
        prev=next=1;
        for(n=-30;n<=10;n++)
        {
            System.out.print(","+prev);
            sum=prev+next;
            prev=next;
            next=sum;
        }
        }
    }



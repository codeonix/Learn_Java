// package Basic Programs in Java;
import java.util.*;

public class QuotientAndRemainder {
 static  int  quotient(int dividend  ,int divisor ){
         int   a = dividend / divisor;

        return  a;
    }
 static int remainder(int dividend ,int divisor)
    {
        int b = dividend % divisor;
        return b;
    }

    public static void main(String args[]){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter Dividend  :");
        int dividend = sr.nextInt();
        System.out.println("Enter Divisor : ");
        int divisor = sr.nextInt();
        int num1quotient = quotient(dividend,divisor);
        int num2divisor = remainder(dividend, divisor);
        System.out.println("Quotient of " + dividend + " / " + divisor + " is " + num1quotient );
        System.out.println("Remainder of " + dividend + " % " + divisor + " is " + num2divisor);
        sr.close();


    }

}

import java.util.*;

public class Add {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1 = sr.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sr.nextInt();

        int c = num1 + num2;
        System.out.println("The sum of "+ num1 + " and "+ num2 + " is " + c );
        sr.close();

    }
}

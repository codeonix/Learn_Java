// package Basic Programs in Java;
import java.util.*;
// import java.util.Scanner;

public class InputByScanner {
    
    static void hello (String name,int gender){
        if(gender == 1 ){
            System.out.println("Welcome Mr. " + name);
        }
        else{
            System.out.println("Welcome Ms. " + name);
        }
    }

    public static void main(String args[]){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        String name = sr.next();
        System.out.println("Enter your gender : (1 for male or 2 for female)");
        int gender = sr.nextInt();
        hello(name, gender);
        sr.close();


    }
}

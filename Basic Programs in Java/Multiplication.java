import java.util.*;


public class Multiplication {
    public  static  float multiply(float a ,float b){//instance method that's why it can be accessing directly withought creating any instance(object) of class.
    float c = a*b;
    return c ;
      
    }

    public static void main(String args[]){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        float num1 = sr.nextFloat();
        System.out.println("Enter Second Number :");
        float num2 = sr.nextFloat();
        float result = multiply(num1,num2); //calling static method directly ,I can also write Multiplication.multiply(float ,float ) to call same method
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + result);

        sr.close();
    }
}

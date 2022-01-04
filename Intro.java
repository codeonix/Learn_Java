public class Intro {
    // java variables 
    
    
//    java introduction 
    public static void main(String[] args) {
        //java variables are used to store values of specific types
        int a =1876;
        System.out.println(a);
        // non-access modifier :
        final int b = 5467;
        System.out.println(b);
        // b=2565; //error

        int myIntNum = 500;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBoolean = true;
        String myString = "Coded World";

        
        System.out.println(myIntNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBoolean);
        System.out.println(myString);
        

        //java Data types :
        // integer : 4 bytes 
        // float   : 4 bytes
        // double  : 8 bytes
        // long  : 8 bytes 
        // byte : 1 byte
        // short   : 2 bytes
        //boolean : 1 bit
        //char : 2 bytes
        //byte -2^7 to 2^7-1 = -128 to 127
        byte myByte = 100;
        System.out.println(myByte);
        //short : 2 byte = 16 bits = -2^15 to 2^15 -1 = -32768 to 32767
        short myShort = 32000;
        System.out.println(myShort);
        //Integer : 4 bytes = 32 bits = -2147483648 to 2147483647
        int myInt = 2147483647;
        System.out.println(myInt);
        //Long : 8 bytes = 64 bits = -2^63 to 2^63-1
        long myLong = 732643784;
        System.out.println(myLong);

        //Floating Point Types : 8 bytes 
        float myFloat = 5.75f;
        System.out.println(myFloat);
        //Double : 8 bytes 
        double myDouble = 19.99d;
        System.out.println(myDouble);
        //boolean = 1 bit 
        boolean isJavaFun = true;
        boolean isJavagood = false;
        System.out.println(isJavaFun);
        System.out.println(isJavagood);

        //characters : 2 bytes
        char myGrade = 'A';
        System.out.println(myGrade);
        char x=65,y=90,z=97;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //String : 
        String greeting = " hello ,welcome to coded world";
        System.out.println(greeting);


        //widening java typer casting (automatically)
      int wideningInt = 8;
      double wideningDouble = wideningInt; //int to double 
      System.out.println(wideningInt);
      System.out.println(wideningDouble);

      //Narrowing Type Casting : (Manually)
      double narrowingDouble = 9.78d;
      int narrowingInt = (int)narrowingDouble;  //double to int (manually)
      System.out.println(narrowingDouble);
      System.out.println(narrowingInt);

    // java Operators : 
    // operators are used to perform some specific task on variables and values 
    // Arithmatic operators
    // Assignment Operators
    // Comparison Operators
    // Logical Operators
    // bitwise Operators
    // Modify operators 
    

            //   Arithmatic operators : +,-,*,/,%
             
            int num1=20,num2=30,result;
            result = num1 + num2;
            System.out.println(result);
            result = num1 - num2;
            System.out.println(result);
            result = num1 * num2;
            System.out.println(result);
            result = num1 / num2;
            System.out.println(result);
            result = num1 %  num2;
            System.out.println(result);


            //Assignment operators : =,+=,-=,*=,/=,%=

            






        

        


        String name ="Coded World";
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("Welcome to Coded World!!!");
    }
}

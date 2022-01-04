public class JavaString {
    public static void main(String[] args){
        String greeting ="hello,welcome to coded world";
        System.out.println("The length of the above String is "+ greeting.length());
        String txt = "hello world";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        String txt2 = "coded world";
        System.out.println(txt2.indexOf("world"));

        String fname = "coded " , lname = "world";
        System.out.println("Welcome to " + fname + " "+ lname);


        //concat() method 
        String firstName = " coded", lastName = " world";
        System.out.println("welcome to "+ firstName.concat(lastName));

        //Escape character 
        System.out.println("\' Man is Mortel \'");
        System.out.println("\" Man is Mortel \"");
        System.out.println("\\ Man is Mortel \\");

        //Escape Sequences : 
        String escape = "Coded \n World ";
        String escape2 = "Coded \r World ";
        String escape3 = "Coded \b World ";
        String escape4 = "Coded \t World ";
        String escape5= "Coded \f World ";
        System.out.println(escape);
        System.out.println(escape2);
        System.out.println(escape3);
        System.out.println(escape4);
        System.out.println(escape5);

        //number + number = number
        //number + String = String 

        int x =10,y=20;
        int z= x+y;
        System.out.println(z);

        System.out.println("10" + 20 ); //1020 ,a string
        

    }
    
}

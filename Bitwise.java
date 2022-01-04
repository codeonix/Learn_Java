public class Bitwise {
    public static void main (String[] args){
        System.out.println("Bitwise Operator : ");
        int a =6,b=10,c;
        // Bitwise AND
        c = a&b ; 
        System.out.println(c);
        // Bitwise OR
        c = a| b;
        System.out.println(c);
        // Bitwise XOR
        c = a^b;
        System.out.println(c);
        // Bitwise Left-shift
        c = a<<1 ;
        System.out.println(c);
        // Bitwise Right Shift
        c = a>>1 ;
        System.out.println(c);
        //Bitwise Complement
        c = ~a;  
        System.out.println(c);

    }
    
}

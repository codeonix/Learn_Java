// Pre-increment ,post-increment,pre.decrement,post-decrement

public class Modifier {
    // Following Steps to solve Modifier operators :
    // Pre-Increment or Pre-Decrement
    // Substitute
    // Evaluate
    // Assignment
    // Post-Increment or Post-decrement

    public static void main(String[] args ){
        int a=100,b;
        b = ++a;
        System.out.println("a is :"+ a + " and b is :"+ b);
        b= --a ; 
        System.out.println("a is :"+ a + " and b is :"+ b);
        b = a++;
        System.out.println("a is :"+ a + " and b is :"+ b);
        b = a--;
        System.out.println("a is :"+ a + " and b is :"+ b);
        
       

    }
    
}

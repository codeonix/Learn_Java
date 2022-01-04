public class JavaStringcharAtMethod {

    public static void main(String[] args){
        //charAt() method returns the character at the specified index in a String.
        //Syntax : public char charAt(int index);
        //Throws IndexOutOfBoundException 

        String txt = "Hello wolrd";
        char result = txt.charAt(4);
        System.out.println(result);
    }
}

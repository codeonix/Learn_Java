public class JavaStringcodePointAtMethod{
    public static void main(String[] args){
        // Java String codePointAt() Method :
        //it Returns the Unicode of the first character in a String
        //The unicode value of A is 65 and Z iz 90
        //The unicode value of a is 97 and z is 122.
        //Syntax : public int codePointAt( int index)
        // Throws an IndexOutOfBoundsException --if index is negative or not less than the length.

        String myStr = "Coded World";
        int result = myStr.codePointAt(0);
        System.out.println(result +"\n");
        String myTxt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0 ; i<=myTxt.length();i++){
            System.out.println(myTxt.codePointAt(i) + "\n");
        }

    }
}
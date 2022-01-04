public class JavaStringcodePointBeforeMethod {
    
    public static void main(String[] args){
        // Java String  codePointBefore() Method : 
        //Syntax : public int codePointBefore(int index)
        //it returns the unicode value of the character before the specified index or a string otherwise it will throw 
        //IndexOutOfBoundsException -if index is negative or not less than the length of the specified string.

        String str= "hello";
        int result = str.codePointBefore(2);
        int result1 = str.codePointBefore(1);
        System.out.println("The unicode of e and h are "+ result + "and "+ result1);

    }
}

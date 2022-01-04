public class Logical{

    public static void main(String[] args){
        int phy=89,chem=88,math=97;
        if(phy >=60 && chem >=60 && math >=60){
            System.out.println("you are in first Division");

        }
        else if (phy <=30 || chem <=30 || math <= 30){
            System.out.println("Better Luck Next Time !!!");
        }

        else if(!(0<=phy && phy<=100)){
           System.out.println("You have some technical glitch in your physics paper");

        }
        else{
            System.out.println("remaining will do later");
        }
        
    }
}

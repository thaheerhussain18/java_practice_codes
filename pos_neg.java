import java.util.*;
class shaikthaheerhussain_Day4{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        if(k<0){
            System.out.println("negative");
        }
        else if (k >0){
            System.out.println("positive");
        }
        else {
            System.out.println("zero");
        }
    }
}
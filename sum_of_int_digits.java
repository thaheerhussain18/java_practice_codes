import java.util.*;
class shaikthaheerhussain_Day10{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        int temp=0;
       while(k!=0){
        int d=k%10;
        temp=temp+d;
        k=k/10;
       }
       System.out.println(temp);
    }
}
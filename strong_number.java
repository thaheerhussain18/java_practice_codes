import java.util.*;
class shaikthaheerhussain_Day10{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        int l=k;
        int temp=0;
        while(k!=0){
            int d=k%10;
            temp=temp+factorial(d);
            k=k/10;
        }
        if(l==temp){
            System.out.println("strong number");

        }
        else{
            System.out.println("not a strong number");
        }
        
    }
    public static int factorial(int n) {
        if(n==0) return 1;
        return n*factorial(n-1);
        
    }
}

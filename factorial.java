import java.util.*;
class factorial{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        int result=1;
        while(k>1){
            result=result*k;
            k=k-1;

        }
        System.out.println(result);
    }
}
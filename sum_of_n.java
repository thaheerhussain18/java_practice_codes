import java.util.*;
class sum_of_n{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        int sum=0;
        for(int i=0;i<k+1;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
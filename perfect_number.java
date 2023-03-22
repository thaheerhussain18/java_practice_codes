import java.util.*;
class perfect_number{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        int sum=0;
        for(int i =1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("perfectnumber,"+sum);
        }
    }
}
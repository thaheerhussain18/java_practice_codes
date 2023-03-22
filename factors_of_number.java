import java.util.*;
class factors_of_number{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        for(int i =1;i<n+1;i++){
            if(n%i==0){
                System.out.print("."+i);
            }
        }
        
    }
}
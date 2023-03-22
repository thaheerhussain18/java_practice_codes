import java.util.*;
class check_prime{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        boolean flag=false;
        
            for(int i=2;i<=k/2;i++){
                if(k%i==0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println("prime");
            }
           
    }
}

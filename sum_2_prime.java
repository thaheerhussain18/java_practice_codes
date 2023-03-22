import java.util.*;
class check_prime{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        
        for(int i=0;i<k+1;i++){
            if(!prime(i)){
                
            }
        }
System.out.println(arr);

        
           
    }

    public static boolean prime(int n) {
        boolean flag=false;
        
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    flag=true;
                    break;
                }
            }
            return flag;
            }
        
    }


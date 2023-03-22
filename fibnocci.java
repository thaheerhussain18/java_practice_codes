import java.util.*;
class fibnocci{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        
        if (n <= 1) {
            System.out.println(n);
        }
        
        int fibPrev = 0;
        int fibCurr = 1;
        System.out.print("Fibonacci Series : "+fibPrev+", "+fibCurr+", ");
        
        for (int i = 2; i <= n; i++) {
             
            int fibNext = fibPrev + fibCurr;
            fibPrev = fibCurr;
            fibCurr = fibNext;
            System.out.print(" ,"+fibCurr);
            
        }
        
        
        
    }
};
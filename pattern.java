import java.util.*;
public class pattern {
    public static void main(String aa[]){
        Scanner scanf=new Scanner(System.in);
        int n=scanf.nextInt();
        for(int i=0;i<n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();;
        }
    }
}

import java.util.*;
class pattern2{
    public static void main(String ar[]){
        // int i=0,j=0;
        Scanner scanf=new Scanner(System.in);
        int n = scanf.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=(n-1)-i && j!=i) System.out.print(" ");
                else System.out.print("*");
                
            }
            
             System.out.println();
        }
    }
}
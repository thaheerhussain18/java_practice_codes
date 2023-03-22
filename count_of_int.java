import java.util.*;
class count_of_int{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        int count=0;
        while(k!=0){
            count++;
            k=k/10;
        }
        System.out.println(count);
    }

    
}
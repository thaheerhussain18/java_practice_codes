import java.util.*;
class reverse_of_number{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        int temp=0;
        while(k!=0){
            int d=k%10;
            temp=temp*10+d;
            k=k/10;
        }
        System.out.println(temp);
    }
}
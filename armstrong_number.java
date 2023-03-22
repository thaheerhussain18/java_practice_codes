import java.util.*;
class armstrong_number{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int k = scanf.nextInt();
        int l=k;
        double temp=0;
        int sizek=size(k);
        while(k!=0){
            int d=k%10;
            temp=temp+Math.pow(d,sizek);
            k=k/10;
        }
        if(l==temp){
            System.out.println("armstrong number"+temp);

        }
        else{
            System.out.println("not a armstrong number"+temp);
        }
        
    }
    public static int size(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
        
    }
}

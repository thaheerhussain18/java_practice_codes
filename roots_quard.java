import java.util.*;
class roots_quard{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        double b2=Math.pow(b, 2)-(4*a*c);
        double root1 =-1*b+Math.sqrt(b2);
        double root2=-1*b-Math.sqrt(b2);
        System.out.println(root1/(2*a));
        System.out.println(root2/(2*a));
    }
}
import java.util.*;
class quadrant{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        int x = scanf.nextInt();
        int y = scanf.nextInt();
        if(x>0 && y>0){
            System.out.println("first quardant");
        }
        else if(x<0 && y>0){
            System.out.println("second quardant");
        }
        if(x<0 && y<0){
            System.out.println("third quardant");
        }
        if(x>0 && y<0){
            System.out.println("fourth quardant");
        }
        
    }
}
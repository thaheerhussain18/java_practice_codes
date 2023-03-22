import java.util.Scanner;
class shaikthaheerhussain_Day2 {
    public static void main(String a[]){
        Scanner scanf = new Scanner(System.in);
        char input = scanf.next().charAt(0);
        if (input <'z' && input >'a'){
            System.out.println("alphabet");
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}
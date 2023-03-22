import java.util.Scanner;
class shaikthaheerhussain_Day1 {
    public static void main(String a[]){
        Scanner scanf = new Scanner(System.in);
        char input = scanf.next().charAt(0);
        if(input == 'a' || input == 'e' || input == 'i' ||input == 'o'|| input == 'u' || input == 'A' || input == 'E' || input == 'I' ||input == 'O'|| input == 'U'){
            System.out.println("vowel");
        }
        else if (input <'z' && input >'a'){
            System.out.println("consonant");
        }
        else{
            System.out.println("Not an alphabet");
        }
    }
}
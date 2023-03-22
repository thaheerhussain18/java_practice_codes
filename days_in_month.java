import java.util.*;
class days_in_month{
    public static void main(String ar[]){
        Scanner scanf = new Scanner(System.in);
        System.out.println("enter year month");
        int year = scanf.nextInt();
        int month = scanf.nextInt();
        
        if(month==2){
            if((year%4==0 && year%100!=0)|| year %400==0){
                
                System.out.println(29);
            }
            else{
                System.out.println(28);
            }
        }
        else if(month == 4||month ==6||month ==9||month ==10){
            System.out.println(30);
        }
        else{
            System.out.println(31);
        }
    }
}
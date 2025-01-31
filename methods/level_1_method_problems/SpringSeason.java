package methods.level_1_method_problems;

import java.util.Scanner;

public class SpringSeason {

    public static boolean springSeasonCheck(int month, int date){
        if(month>=3 && month <= 6 && date >= 1 && date <=20){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month : ");
        int month = sc.nextInt();
        if(month<1 && month >12){
            System.out.println("Please enter a valid month ");
            month = sc.nextInt();
        }
        System.out.println("Enter a date : ");
        int date = sc.nextInt();
        if(date < 1 && date > 31){
            System.out.println("Please enter a valid date ");
            date = sc.nextInt();
        } 
        if(springSeasonCheck(month, date)){
            System.out.println("Spring season");
        } else {
            System.out.println("Not a spring season");
        }
        sc.close();
    }
}

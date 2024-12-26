import java.util.Scanner;

public class FactorialOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial: ");
        int n = sc.nextInt();
       
        if(n<0){
            System.out.println("Enter a positive integer");
        }
        else{
            int fact = 1;
            while (n!=0) {
                fact = fact *n;
                n--;
            }
            System.out.println(fact);
        }
    }

}

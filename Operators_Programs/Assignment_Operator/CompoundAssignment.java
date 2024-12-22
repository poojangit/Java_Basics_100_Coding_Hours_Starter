//todo : program to demostrate the use of all the compound assignment

import java.util.Scanner;

public class CompoundAssignment{
    public static void calc(int n){
        int sum = 0;
        int sub = 0;
        int mul = 1;
        double div = 1;
        for(int i = 1; i<=n; i++){
            sum += i;
            sub -= i;
            mul *= i;
           if(i != 0 ){
            div /= i;
           }
        }
        System.out.println("Add: " + sum + " Sub: " + sub + " mul: " + mul + " div : " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
       calc(n);
        sc.close();
    }
}
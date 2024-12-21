//todo : program to find the largest amoung three numbers 

import java.util.Scanner;

public class MaxOfThreeNum {
    public static int findMax(int a, int b, int c){
        int max;
        if(a>b && a>c){
            max = a;
        }
        else if(b>a && b>c){
            max = b;
        }
        else{
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum of three numbers : "+findMax(a, b, c));
        sc.close();
    }
}

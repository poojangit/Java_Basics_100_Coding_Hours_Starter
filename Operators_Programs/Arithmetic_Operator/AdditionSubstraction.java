//todo : program to accept the two integer from the user and to perform addition and substraction

import java.util.Scanner;
public class AdditionSubstraction {

    public static int add(int n, int m){
        int add = n+m;
        return add;
    }
    public static int sub(int n,int m){
        int sub = n-m;
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Addition of two numbers : " + add(n, m));
        System.out.println("Substraction of two numbers : " + sub(n, m));
    }
}
// todo : program to demonstrate the diff between post-incre and pe-incre operator

import java.util.Scanner;

public class PrePostIncrement {
    public static int preIncrement(int n){
        int a = ++n;
        return a;
    }
    public static int postIncrement(int n){
        int b = n++;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(preIncrement(n));
        System.out.println(postIncrement(n));
    }
}

//todo : Program to find the minimum of two numbers using ternary operators

import java.util.Scanner;

public class MinOfTwoNumbers {
    public static int findMin(int n, int m) {
        int res = (n < m) ? n : m;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findMin(n, m));
    }

}
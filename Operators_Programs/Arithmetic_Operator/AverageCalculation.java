
import java.util.Scanner;

public class AverageCalculation {

    public static int averageCal(int n , int a, int b, int c, int d, int e){
        int sum = 0;
        sum = a+b+c+d+e;
        int avg = sum /n;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an output");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " integer numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
        System.out.println("Average : "+averageCal(n, a,b,c,d,e));
        sc.close();
    }
}

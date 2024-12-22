
import java.util.Scanner;

// todo : program that divides a given number by 2 using the right shift operator
public class BitwiseShiftDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int div = n >> 1;
        System.out.println("The result : " + div);
    }
}

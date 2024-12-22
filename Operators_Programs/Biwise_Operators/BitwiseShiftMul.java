
import java.util.Scanner;

//todo : program that multiplies a given integer by 2 using the left shift operator.

public class BitwiseShiftMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int result = num << 1;
        System.out.println(" The result of multiplying " + num + " by 2 is : " + result);
        sc.close();
    }
}

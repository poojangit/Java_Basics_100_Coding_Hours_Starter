//todo : Similarly, write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;

public class DoubleOperaion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 integers: ");
        double a = sc.nextInt();
        double b  = sc.nextInt();
        double c = sc.nextInt();
        double operation1 = a+b*c;
        double operation2 = a*b+c;
        double operation3 = c+a/b;
        double operation4 = a%b+c;
        System.out.println("The result of Int Operations are " + operation1 + "," + operation2 +"," + operation3 + "," + operation4);

    }
}

import java.util.Scanner;
// Write a program to calculate the perimeter of a rectangle. Take the length
// and width as inputs and use the formula:
// Perimeter = 2 * (length + width).
public class PerimeterOfRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("Enter the width: ");
        int width = sc.nextInt();
        double perimeter = 2*(length+width);
        System.out.println("The perimeter of a rectangle is "+perimeter);
    }
}
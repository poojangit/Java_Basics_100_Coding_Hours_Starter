//todo :  Write a program to find the side of the square whose parameter you read from user 
//! Hint => Perimeter of Square is 4 times side
//! I/P => perimeter
//! O/P => The length of the side is ___ whose perimeter is ____

import java.util.Scanner;

public class FindSideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter : ");
        double perimeter = sc.nextDouble();
        double sides = perimeter/4;
        System.out.println("The side of a square is " + sides + " for a perimeter " + perimeter);
    }
}

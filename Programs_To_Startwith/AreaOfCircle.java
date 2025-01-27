package Programs_To_Startwith;//4. Area of a Circle
//Write a program to calculate the area of a circle. Take the radius as input
//and use the formula:
//Area = π * radius^2.

import java.util.Scanner;
class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = sc.nextInt();
        Double Area = Math.PI * (radius*radius);
        System.out.println("Area of a circle is " + Area);
    }
}
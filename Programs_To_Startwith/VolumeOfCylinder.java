// 5. Volume of a Cylinder
// Write a program to calculate the volume of a cylinder. Take the radius and
// height as inputs and use the formula:
// Volume = π * radius^2 * height.

import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height : ");
        double height = sc.nextDouble();
        double volume = Math.PI*Math.pow(radius, 2)*height;
        System.out.println("The Volume of a cylinder is " + volume);
        sc.close();
    }
}
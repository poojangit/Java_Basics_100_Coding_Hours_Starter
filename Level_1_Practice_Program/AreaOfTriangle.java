//todo : Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
//! Hint => Area of a Triangle is ½ * base * height
//! I/P => base, height
//! O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base and height in inches: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        double areaInSquareInch = 0.5 * base*height;
        System.out.println(areaInSquareInch);
        double areaIncm = areaInSquareInch * 6.4516;
        System.out.println("Area of a triangle in square inches : " + areaInSquareInch + " Area in sqaure centimeters : " + areaIncm);
        
    }
}

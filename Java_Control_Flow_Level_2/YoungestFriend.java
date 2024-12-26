//todo : Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
//! Hint => 
//! Take user input for the age and height of the 3 friends and store it in a variable
//! Find the smallest of the 3 ages to find the youngest friend and display it
//! Find the largest of the 3 heights to find the tallest friend and display it

import java.util.Scanner;

public class YoungestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Amar in cm: ");
        int amarAge = sc.nextInt();
        System.out.println("Enter amar height: ");
        double amarHeight = sc.nextDouble();
        System.out.println("Enter age of akbar in cm ");
        int akbarAge = sc.nextInt();
        System.out.println("Enter akbar height: ");
        double akbarHeight = sc.nextDouble();
        System.out.println("Enter age of anthony in cm");
        int anthonyAge = sc.nextInt();
        System.out.println("Enter anthony height: ");
        double anthonyHeight = sc.nextDouble();
        int youngestAge = Math.min(amarAge, Math.min(anthonyAge, akbarAge));
        String youngestFriend = (youngestAge == amarAge) ? "Amar" : (youngestAge == akbarAge) ? "Akbar" : "Anthony"; 
        double tallestHeight = Math.max(amarHeight , Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = (tallestHeight == amarHeight) ? "Amar" : (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";
        System.out.println("Youngest friend : " + youngestFriend);
        System.out.println("Tallest friend : "+ tallestFriend);
    }
}
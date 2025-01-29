package Logic_Questions_On_Java.arrays;
// Create a program to find the mean height of players present in a football team.
// Hint => 
// The formula to calculate the mean is: mean = sum of all elements / number of elements
// Create a double array named heights of size 11 and get input values from the user.
// Find the sum of all the elements present in the array.
// Divide the sum by 11 to find the mean height and print the mean height of the football team

import java.util.Scanner;

public class HeightOfFootballPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        int noOfElements = heights.length;
        double sum = 0.0;
        System.out.println();
        System.out.println();
        System.out.println("Enter a heights of all the players: ");
        for(int i=0; i<heights.length ; i++){
             heights[i] = sc.nextDouble();
            sum =+ heights[i];
        }
        double mean = sum/noOfElements;
        System.out.println("Mean height of the football team "+mean);
        sc.close();
    }
}

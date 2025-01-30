package logic_question_on_arrays_strings.level_2_arrays_problems;
// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
// Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
// Finally display the youngest and tallest of the 3 friends

import java.util.Scanner;

public class FindTheYoungestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String[] friends = {"Amar", "Akbar", "Antony"};
        double[] height = new double[3];
        int[] age = new int[3];
        System.out.println("Enter the heights of three friends : ");
      
        for(int i =0 ; i<height.length; i++){
            System.out.println(friends[i] + "'s height" );
            int heightOfFriends = sc.nextInt();
            height[i] = heightOfFriends;
        }
        System.out.println("Enter the ages of three friends : ");   
        for(int i=0; i<age.length; i++){
            System.out.println( friends[i] +"'s age");
            int ageOfFriends = sc.nextInt();
            age[i] = ageOfFriends;
        }

        int youngestIndex = 0;
        int tallestIndex = 0;
        for(int i = 0 ; i<height.length; i++){
            if (height[i]> height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        for(int i=0; i<age.length;i++){
            if(age[i] < age[youngestIndex]){
                youngestIndex = i;
            }
        }
        System.out.println("Tallest friend is " + friends [tallestIndex] + "Height : " + height[tallestIndex] );
        System.out.println("Youngest friend is " + friends[youngestIndex] + "Age : " + age[tallestIndex]);

        sc.close();
    }
}

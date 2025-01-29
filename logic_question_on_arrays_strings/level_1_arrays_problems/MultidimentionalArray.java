package Logic_Questions_On_Java.arrays;
// Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
// Hint => 
// Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
// Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
// Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
// Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element

import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Enter the row size : ");
        int row = sc.nextInt();
        System.out.println("Enter the columns size : ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter the elements for 2D arrays: ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.println("Elements : " + i + " " + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] array = new int[row*column];
        int index = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[index++] = matrix[i][j];
            }
        }
        System.out.println("Elements of 1D arrays : ");
        for(int elements : array) {
            System.out.print(elements + " ");
        }
        sc.close();
    }
}

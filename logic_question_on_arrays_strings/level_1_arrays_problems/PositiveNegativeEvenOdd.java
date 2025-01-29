package logic_question_on_arrays_strings.level_1_arrays_problems;

import java.util.Scanner;

public class PositiveNegativeEvenOdd {
      public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i =0 ; i<arr.length; i++){
            if (arr[i]<0) {
                System.out.println(arr[i] + " is a negative number");
            }
            else if(arr[i] > 0) {
                if(arr[i]%2 == 0){
                    System.out.println( arr[i] + " is a positive even number");
                }
                else {
                    System.out.println(arr[i] + " is a positive odd number");
                }
            }
            else {
                System.out.println("zero");
            }
           
        }
        System.out.println("\nComparison of the first and last elements of the array:");
        int first = arr[0];
        int last = arr[size - 1]; 
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
        
        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
        
        sc.close();
    }

}

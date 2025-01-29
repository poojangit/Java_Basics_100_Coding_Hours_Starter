package logic_question_on_arrays_strings.level_2_arrays_problems;

// Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
// Hint => 
// In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
// To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
// Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number


import java.util.Scanner;

public class LargestDigitFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        sc.close();
        int index = 0;
        if(number<0){
            System.out.println("Please enter a valid psotive numbers: ");
           return;
        }
        while(number != 0){
            if(index == maxDigit){
             maxDigit += 10;
             int[] temp = new int[maxDigit];
             System.arraycopy(digits,0,temp,0, digits.length);
             digits = temp;
                break;
            }
            digits[index++] = number%10;
            number /= 10;
        }
        if(index == 0){
            System.out.println("No digits to operate");
            return;
        }
        int largest = -1, secondLargest = -1;
        for(int i=0; i<index; i++){
            if(digits[i]>largest){
                secondLargest = largest;
                largest = digits[i];
            } else if(digits[i]>secondLargest &&digits[i]!=0){
                secondLargest = digits[i];
            }
        }
        for(int i=0; i<index; i++){
            System.out.print(digits[i] + " ");
            
        }
        System.out.println();
        System.out.println("Largest digit : " +largest);
            System.out.println("Second largest : " + secondLargest);
     sc.close();
    }
}
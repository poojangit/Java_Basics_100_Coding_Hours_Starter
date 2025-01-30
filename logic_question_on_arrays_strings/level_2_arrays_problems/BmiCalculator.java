package logic_question_on_arrays_strings.level_2_arrays_problems;

import java.util.Scanner;

// An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
// Hint => 
// Take input for a number of persons
// Create arrays to store the weight, height, BMI, and weight status of the persons
// Take input for the weight and height of the persons
// Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
// Display the height, weight, BMI, and weight status of each person
// Use the table to determine the weight status of the person

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Enter number of persons: ");
        int persons = sc.nextInt();
        String[] weightStatus = {"Underweight", "Normal", "Overweight", "Obese"};

        double[] weights = new double[persons];
        double[] heights = new double[persons];
        double[] bmis = new double[persons];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {
            System.out.println("Weight of person " + (i + 1));
            double weightOfaPerson = sc.nextDouble();
            weights[i] = weightOfaPerson;

            System.out.println("Height of person " + (i + 1));
            double heightOfaPerson = sc.nextDouble();
            heights[i] = heightOfaPerson;

            bmis[i] = weights[i] / (heights[i]*heights[i]);

            if(bmis[i] <= 18.4){
                status[i] = weightStatus[0];
            }
            else if(bmis[i] >= 18.5 && bmis[i] < 24.9){
                status[i] = weightStatus[1];
            }
            else if(bmis[i] >= 25.0 && bmis[i] <= 39.9){
                status[i] = weightStatus[2];
            }
            else{
                status[i] = weightStatus[3];
            }
        }
        System.out.println();
        System.out.println("BMI Report");
        System.out.println();
        for(int i=0; i<persons; i++){
            System.out.println("Person " + (i+1));
            System.out.println(heights[i]);
            System.out.println(weights[i]);
            System.out.println(bmis[i]);
            System.out.println(status[i]);
            System.out.println();
        }
       sc.close(); 
    }
}

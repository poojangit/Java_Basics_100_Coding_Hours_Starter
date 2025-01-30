package logic_question_on_arrays_strings.level_2_arrays_problems;
// Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
// Hint => 
// Take input for a number of persons
// Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
//        double[][] personData = new double[number][3];
//        String[] weightStatus = new String[number];
// Take input for weight and height of the persons and for negative values, ask the user to enter positive values
// Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
// Display the height, weight, BMI and status of each person


import java.util.Scanner;

public class BmiCalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons : ");
        int persons = sc.nextInt();
        double[][] personData = new double[persons][3];
        String[] weightStatus = new String[persons];
        String[] status = {"Underweight", "Normal", "Overweight", "Obese"};
        for(int i=0; i<persons; i++){
            System.out.println("Person " + (i+1) );
            System.out.println("Enter height in meters");
            personData[i][0] = sc.nextDouble();
            System.out.println("Enter weight in kilometers");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][1]/(personData[i][0]* personData[i][0]);
            double bmi = personData[i][2];
            if(bmi <= 18.4){
                weightStatus[i] = status[0];
            }
            else if(bmi >= 18.5 && bmi< 24.9){
                weightStatus[i] = status[1];
            }
            else if(bmi >= 25.0 && bmi <= 39.9){
                weightStatus[i] = status[2];
            }
            else{
                weightStatus[i] = status[3];
            }

        }
        System.out.println();
        System.out.println("BMI Report");
        System.out.println();
        for(int i=0; i<persons; i++){
            System.out.println("Person " + (i+1));
            System.out.println(personData[i][0]);
            System.out.println(personData[i][1]);
            System.out.println(personData[i][2]);
            System.out.println(weightStatus[i]);
            System.out.println();
        }
        sc.close();
    }
}

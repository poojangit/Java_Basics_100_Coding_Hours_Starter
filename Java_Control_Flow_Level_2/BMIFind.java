//todo : Create a program to find the BMI of a person
//! Hint => 
//! Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
//! Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
//! Use the table to determine the weight status of the person

import java.util.Scanner;

public class BMIFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your height in cm");
        double heightInCm = sc.nextDouble();
        double heightInMeter = heightInCm*0.01;
        System.out.println("Enter your weight in kg ");
        double weight = sc.nextDouble();
        double bmi = weight/(heightInMeter*heightInMeter);
        System.out.println(bmi);
        sc.close();
        if(bmi<=18.4){
            System.out.println("Hey "+ name + " your weight is " +"Underweight");
        }
        else if(bmi>= 18.5 && bmi <=24.9){
            System.out.println("Hey "+ name + " your weight is " + "Normal");
        }
        else if(bmi>=25.0 && bmi<=39.9){
            System.out.println("Hey "+ name + " your weight is " + "Overweight");
        }
        else{
            System.out.println("Hey "+ name + " your weight is " + "Obese");
        }
    }
}

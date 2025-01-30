package logic_question_on_arrays_strings.level_2_arrays_problems;

// Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
// Hint => 
// Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
// Define a double array to save salary and years of service for each of the 10 employees
// Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
// Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
// Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
// Print the total bonus payout as well as the total old and new salary of all the employees

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        final int TOTAL_EMPLOYEE = 10;
        final double HIGH_BONUS_RATE = 0.05;
        final double LOW_BONUS_RATE = 0.02;
        double[] salaries = new double[TOTAL_EMPLOYEE];
        double[] yearOfService = new double[TOTAL_EMPLOYEE];
        double[] newSalary = new double[TOTAL_EMPLOYEE];
        double[] bonuses = new double[TOTAL_EMPLOYEE];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < TOTAL_EMPLOYEE; i++) {
            System.out.println("Enter details of Employee : " + (i + 1) + " : ");
            while (true) {
                System.out.println("Enter the salary : ");
                double salary = sc.nextDouble();
                if (salary > 0) {
                    salaries[i] = salary;
                    break;
                } else {
                    System.out.println("Please enter the valid salary! ");
                }
            }
            while (true) {
                System.out.println("Enter the years of service: ");
                int serviceYear = sc.nextInt();
                if(serviceYear>0){
                    yearOfService[i] = serviceYear;
                    break;
                }
                else {
                    System.out.println("Year of service should be more than 0");
                }
            }
        }
        for(int i=0; i<TOTAL_EMPLOYEE; i++){
            double bonusRate = yearOfService[i] > 5 ? HIGH_BONUS_RATE : LOW_BONUS_RATE; 
            double bonus = salaries[i] * bonusRate;
            bonuses[i] = bonus;
            newSalary[i] = salaries[i]*bonusRate;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Employee salary details: ");
        for(int i=0; i<TOTAL_EMPLOYEE; i++){
            System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
            (i + 1), salaries[i], bonuses[i], newSalary[i]);

            System.out.println("Total Bonus : " + totalBonus);
            System.out.println("TotalOldSalary : " + totalOldSalary);
            System.out.println("TotalNewSalary : " + totalNewSalary);
            System.out.println();
        }
    }

}

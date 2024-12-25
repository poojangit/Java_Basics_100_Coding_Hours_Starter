//todo : Create a program to find the bonus of employees based on their years of service.
//! Hint => 
//! Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
//! Take salary and year of service in the year as input.
//! Print the bonus amount.

import java.util.Scanner;

public class EmployeeBonous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of service: ");
        double year = sc.nextDouble();
        System.out.println("Please enter your salary");
        double currentSalary = sc.nextDouble();
        // ~ Adding 5% bonous
        if (year > 5) {
            double bonus = currentSalary * 0.05;
            double newSalary = currentSalary + bonus;
            System.out.println("Your new Salay will be: " + newSalary);
        }
        else{
            System.out.println("There will be no change in your salary: " + currentSalary);
        }

    }
}

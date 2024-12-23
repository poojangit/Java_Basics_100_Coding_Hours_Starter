// todo : Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
//! I/P => NONE
//! O/P => Harry's age in 2024 is ___

public class HenryAgeCalculation {
    public static void main(String[] args) {
        int currentYear = 2024;
        int birthYear = 2000;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in" + currentYear + " is " + age);
    }
}
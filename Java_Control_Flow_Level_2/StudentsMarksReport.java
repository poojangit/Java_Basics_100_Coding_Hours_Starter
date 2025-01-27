//todo : Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
//! Hint => 
//! Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks

import java.util.Scanner;
public class StudentsMarksReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of pysics out of 100");
        double pysics = sc.nextDouble();
        System.out.println("Enter marks of chemistry out of 100");
        double chemistry = sc.nextDouble();
        System.out.println("Enter marks of maths  out of 100");
        double maths = sc.nextDouble();
        double sumOfAllTheMarks = pysics+chemistry+maths;
        double averageMarks = (sumOfAllTheMarks)/3;
        double totalMaximumMarks = 300;
        double percentage = (sumOfAllTheMarks/totalMaximumMarks)*100;
        char grade ;
        String remarks;
        if(percentage>= 80){
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        }
        else if(percentage>=70){
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        }
        else if(percentage>=60){
            grade = 'C';
            remarks = "Level 2,below, but approaching agency-normalized standards";
        }
        else if(percentage>=50){
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        }
        else if(percentage>=40){
            grade = 'E';
            remarks = "Level 1, too below, agency-normalized standards";
        }
        else {
            grade = 'R';
            remarks = "Remidial standards";
        }
        System.out.println("Marks card :");
        System.out.println("Average marks of students: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade : " + grade);
        System.out.println("Remarks: " + remarks);
    }
    
}

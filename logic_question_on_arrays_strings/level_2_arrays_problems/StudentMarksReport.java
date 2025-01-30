package logic_question_on_arrays_strings.level_2_arrays_problems;
// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

import java.util.Scanner;

// Hint => 
// Take input for the number of students
// Create arrays to store marks, percentages, and grades of the students
// Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
// Calculate the percentage and grade of the students based on the percentage
// Display the marks, percentages, and grades of each student
public class StudentMarksReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Enter number of students : ");
        int noOfStudents = sc.nextInt();
        double[] physicsMarks = new double[noOfStudents];
        double[] chemistryMarks = new double[noOfStudents];
        double[] mathsMarks = new double[noOfStudents];
        double[] percentages = new double[noOfStudents];
        String[] grades = new String[noOfStudents];
        String[] remarks = {
            "Level 4, above agency-normalized standards",
            "Level 3, at agency-normalized standards",
            "Level 2, below, but approaching agency-normalized standards",
            "level 1, well below agency-normalized standards",
            "Level 1 -, too below agency-normalized standards",
            "Remedial students"
         };
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("Enter the marks of a student " + (i + 1));
            while (true) {
                System.out.println(" Pysics marks : ");
                physicsMarks[i] = sc.nextDouble();
                if (physicsMarks[i] >= 0 && physicsMarks[i] <= 100)
                    break;
                System.out.println("Please enter a valid marks!");
            }
            while(true) {
                System.out.println("Chemistry marks : ");
                chemistryMarks[i] = sc.nextDouble();
                if(chemistryMarks[i] >=0 && chemistryMarks[i] <= 100)
                break;
                System.out.println("Please enter a valid marks!");
            }
            while (true) {
                System.out.println("Maths marks : ");
                mathsMarks[i] = sc.nextDouble();
                if(mathsMarks[i] >=0 && mathsMarks[i] <= 100)
                break;
                System.out.println("Please enter a valid marks! ");
            }
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks/300)*100;
            if (percentages[i] >= 80) {
                grades[i] = remarks[0];
            } else if (percentages[i] >= 70) {
                grades[i] = remarks[1];
            } else if (percentages[i] >= 60) {
                grades[i] = remarks[2];
            } else if (percentages[i] >= 50) {
                grades[i] = remarks[3];
            } else if (percentages[i] >= 40) {
                grades[i] = remarks[4];
            } else {
                grades[i] = remarks[5];
            }
            System.out.println();
        }
        sc.close();
        System.out.println("-----------Student's Marks Report ----------");
        for(int i=0 ; i<noOfStudents; i++){
            System.out.println("Student " + (i+1));
            System.out.println("Physics : " + physicsMarks[i]);
            System.out.println("Chemistry : " + chemistryMarks[i]);
            System.out.println("Maths : " + mathsMarks[i]);
            System.out.println("Percentage : " + percentages[i] + "%");
            System.out.println("Remarks : " + grades[i]);
            System.out.println("------------------");
        }
    }


}

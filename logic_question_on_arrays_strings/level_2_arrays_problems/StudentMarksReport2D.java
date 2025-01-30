package logic_question_on_arrays_strings.level_2_arrays_problems;
// Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
// Hint => 
// All the steps are the same as the problem 8 except the marks are stored in a 2D array
// Use the 2D array to calculate the percentages, and grades of the students
import java.util.Scanner;
public class StudentMarksReport2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Enter number of students : ");
        int noOfStudents = sc.nextInt();
       double[][] marks = new double[noOfStudents][3];
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
           String[] subjects = {"physics", "Chemistry", "Maths"};
           for(int j=0 ; j< 3; j++){
            while (true) {
                System.out.println(subjects[j] + " marks :");
                marks[i][j] = sc.nextDouble();
                if (marks[i][j] >= 0 && marks[i][j] <= 100)
                    break;
                System.out.println("Please enter a valid marks!");
            }
           }
           
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println("Physics : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths : " + marks[i][2]);
            System.out.println("Percentage : " + percentages[i] + "%");
            System.out.println("Remarks : " + grades[i]);
            System.out.println("------------------");
        }
    }


}



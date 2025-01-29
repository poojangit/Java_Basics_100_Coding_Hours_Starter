package logic_question_on_arrays_strings.level_1_arrays_problems;
import java.util.*;
public class VoteEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int students = sc.nextInt();
        int[] age = new int[students];
        System.out.println("Enter the ages of all the " + students + " Students");
        for(int i =0 ; i< students; i++){
            age[i] = sc.nextInt();
        }
        for(int i=0; i<age.length; i++){
            if (age[i] < 0) {
                System.out.println("Invalid age");
            } else if(age[i] >= 18){
                System.out.println("Student with age " + age[i] + " is eligible to vote");
            } else {
                System.out.println( "Student with age " + age[i] + " Not eligible to vote");
            }
            sc.close();
        }
    
}

}

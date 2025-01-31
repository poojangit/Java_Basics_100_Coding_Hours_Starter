package methods.level_1_method_problems;

import java.util.Scanner;

public class NumberOfHandShakes {
    public static int possibleHandshakes(int students){
        int maxOfHandshakes = (students*(students-1)/2);
        return maxOfHandshakes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the Number of students : ");
        int numOfStudents = sc.nextInt();
        System.out.println("The maximum number of possible handshakes are : " + possibleHandshakes(numOfStudents));
        

        sc.close();
    }
}

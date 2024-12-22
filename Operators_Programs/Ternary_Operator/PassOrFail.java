//todo : program that determines if a student has passed or failed based on their marks using the ternary operator

import java.util.Scanner;

public class PassOrFail {
    public static String checkPassOrFail(int marks){
        return (marks >= 30) ? "pass": "fail";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks : ");
        int marks = sc.nextInt();
        System.out.println(checkPassOrFail(marks));
    }
}

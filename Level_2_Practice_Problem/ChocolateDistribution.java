//todo : Create a program to divide N number of chocolates among M children.
//! Hint => 
//! Get an integer value from user for the numberOfchocolates and numberOfChildren.
//! Find the number of chocolates each child gets and number of remaining chocolates
//! Display the results
//! I/P => numberOfchocolates, numberOfChildren
//! O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are __.

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int noOfStudents = sc.nextInt();
        System.out.println("Enter number of chocolate: ");
        int noOfChocolate = sc.nextInt();
        int noOfChocolateForEachChild = noOfChocolate/noOfStudents;
        int remainingChocolate = noOfChocolate%noOfStudents;
        System.out.println("The number of chocolate each child will get is " + noOfChocolateForEachChild + " and thenumber of remaining chocolates are " + remainingChocolate);
        sc.close();
    }
}

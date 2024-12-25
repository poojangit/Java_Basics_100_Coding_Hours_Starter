//todo : double bonus = currentSalary * 0.05;
//! double newSalary = currentSalary + bonus;
//! System.out.println("Your new Salay will be: " + newSalary);

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value: ");
        int integer = sc.nextInt();
        if(integer>=0){
            System.out.println("The multiplication table for 6 to 9 are: ");
            for(int i=6 ; i<=9; i++){
                System.out.println(integer + "*" + i + " = " + integer*i);
            }
        }
    }
}

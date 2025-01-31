package methods.level_1_method_problems;

import java.util.Scanner;

public class AthleteRuns {
    public static double numberOfRounds(int sides, int distance){
        int perimeterOfTriangle = sides+sides+sides;
        double rounds = distance/perimeterOfTriangle;
        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DISTANCE = 5000;
        System.out.println("\nEnter the values for 3 sides of triangle in meters  :");
        int sides = 0;
        for(int i=0; i<3;i++){
            System.out.println("Side " + (i+1) + " : ");
            sides = sc.nextInt();
            
        }
            System.out.println("Number of rounds : " +  numberOfRounds(sides, DISTANCE));
        sc.close();
    }
}

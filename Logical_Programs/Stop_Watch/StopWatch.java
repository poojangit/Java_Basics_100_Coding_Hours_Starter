// todo : Simulate the Stopwatch Program
// ! a. Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
// ! b. I/P -> Start the Stopwatch and End the Stopwatch
// ! c. Logic -> Measure the elapsed time between start and end
// ! d. O/P -> Print the elapsed time.

import java.util.Scanner;

public class StopWatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("click to start the stopwatch");
        sc.nextLine();
        long start = System.currentTimeMillis();
        System.out.println("click to stop the stop watch");
        sc.nextLine();
        long end = System.currentTimeMillis();
        long elapsedTime = (end - start)/1000;
        System.out.println(elapsedTime + " seconds");
        sc.close();
    }
}
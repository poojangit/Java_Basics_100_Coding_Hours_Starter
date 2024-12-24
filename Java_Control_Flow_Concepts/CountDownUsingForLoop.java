import java.util.Scanner;

public class CountDownUsingForLoop {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a counter: ");
    int counter = sc.nextInt();
    for(int i= counter; i>= 1 ;i--){
        System.out.println(counter);
        counter--;
    }

 }
}
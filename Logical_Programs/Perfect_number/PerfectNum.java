// todo :
//^ a. Just like the Armstrong number, the Perfect Number is also a special type of positive number.
//^ When the number is equal to the sum of its positive divisors excluding the number, it is called a Perfect Number.
//^ For example, 28 is the perfect number
//^ because when we sum the divisors of 28, it will result in the same number.
//^ The divisors of 28 are 1, 2, 4, 7, and 14. So,
//^ b. 28 = 1+2+4+7
//^ c. 28 = 28

import java.util.Scanner;

public class PerfectNum {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum == n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(isPerfect(n)){
            System.out.println("Number is perfect number");
        } else{
            System.out.println("Not a perfect number");
        }
    }
}
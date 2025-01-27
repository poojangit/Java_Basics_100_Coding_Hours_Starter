//3. Celsius to Fahrenheit Conversion
//Write a program that takes the temperature in Celsius as input and converts
//it to Fahrenheit using the formula:
//Fahrenheit = (Celsius * 9/5) + 32.
import java.util.Scanner;
class CelciusToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature in celcius : ");
        double celcius = sc.nextDouble();
        double fahrenheit = (celcius*9/5) + 32;
        System.out.println("The Fahrenheit value is " + fahrenheit);
    }
}
//todo : Write a program to demonstrate the use of bitwise AND, OR, and XOR operators on two integers

public class BitwiseAndOrXor {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        System.out.println( "Result of AND operator of " + a + " & " + b + " are " + andResult );
        System.out.println( "Result of OR operator of " + a + "  | " + b + " are " + orResult );
        System.out.println( "Result of XOR operator of " + a + " ^ " + b + " are " + xorResult);
    }   
}

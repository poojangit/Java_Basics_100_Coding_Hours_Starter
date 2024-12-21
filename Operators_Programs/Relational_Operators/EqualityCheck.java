import java.util.Scanner;

// public class EqualityCheck {
//     public static boolean isEqual(String str1, String str2){
//         return str1.equals(str2);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the two strings : ");
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();
//         // System.out.println(isEqual(str1, str2));
//         if(isEqual(str1, str2)){
//             System.out.println("The entered strings are equal");
//         }
//         else {
//             System.out.println("Entered strings are not equal");
//         }
//     }
// }

public class EqualityCheck {
    public static boolean checkEqual(String str1, String str2) {
        // return str1.length() == str2.length();
        boolean isEqual = false;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                } else {
                    isEqual = true;
                }
            }
        }
        return isEqual;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two string : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(checkEqual(str1, str2));

    }
}
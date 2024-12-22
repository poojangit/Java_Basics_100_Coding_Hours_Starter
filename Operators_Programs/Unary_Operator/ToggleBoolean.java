//todo : create a program that toggles a boolean variable using the logical NOT operator

public class ToggleBoolean {
   
    public static void main(String[] args) {
        boolean isMarried = false;
        System.out.println("Married : " + isMarried);
        isMarried = !isMarried;
        System.out.println("Afer toggled : " + isMarried);
        isMarried = !isMarried;
        System.out.println("Again Toggled : " + isMarried);
    }
}

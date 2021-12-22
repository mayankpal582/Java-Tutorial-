import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        // Scanner class is used to take a input from the user.
        // Scanner class is already defined in java.util.Scanner
        // To use Scanner class we have to create a object and that object name is (sc) here.
        // Primitive datatype are those whose value already defined by java means there size are already fixed.
        // Non-Primitive datatype are those which are created by us.
        Scanner inpu = new Scanner(System.in);
        System.out.println("Enter Your age:");
        int age = inpu.nextInt();
        System.out.println(2 * age);
        

    }
}

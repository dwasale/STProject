import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        registration(age);
    }
    public static void registration(int age){
        if (age < 100) {
            if (age >= 16) {
                System.out.println("You are eligible to register for vote");
            } else {
                System.out.println("You are not eligible");
            }
        } else {
            System.out.println("Your are too old to register for vote");
        }
    }
}

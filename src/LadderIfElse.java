import java.util.Scanner;

public class LadderIfElse {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

//        if (marks >= 70 && marks <= 100){
//            System.out.println("Distinction");
//        } else if (marks >= 60 && marks < 70){
//            System.out.println("First");
//        } else if (marks >= 35 && marks < 60){
//            System.out.println("Passed");
//        } else if (marks >= 0 && marks < 35 ){
//            System.out.println("Fail");
//        } else {
//            System.out.println("Invalid marks");
//        }
        if (marks < 0 || marks > 100){
            System.out.println("Invalid marks");
        } else if (marks >= 70){
            System.out.println("Distinction");
        } else if (marks >=60){
            System.out.println("First");
        } else if (marks >= 35){
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
    }
}

import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Marks obtained in English: ");
        int marksInEnglish = scanner.nextInt();
        System.out.print("Marks obtained in Maths: ");
        int marksInMaths = scanner.nextInt();
        System.out.print("Marks obtained in Science: ");
        int marksInScience = scanner.nextInt();
        MarkSheet markSheet = new MarkSheet();

        markSheet.studentMarkSheet(name,rollNumber,marksInEnglish ,marksInMaths,marksInScience);
    }

    public void studentMarkSheet(String name, int rollNo, int marksInEnglish, int markInMaths, int marksInScience){
        int total = markInMaths + marksInEnglish + marksInScience;
        int percentage = total / 3;

        System.out.println("----------------------------");
        System.out.println("Marks Obtained by " + name +"\nRoll Number: " + rollNo);
        System.out.println("English: " + marksInEnglish + "\nMaths: " + markInMaths + "\nScience: " + marksInScience);
        System.out.println("----------------------------");
        System.out.println("Total: " + total + "\nPercentage: " + percentage);
        System.out.println("----------------------------");

        if (percentage >= 35){
            System.out.println("Congratulation! You have passed");
        } else {
            System.out.println("Sorry! You have failed");
        }
    }
}

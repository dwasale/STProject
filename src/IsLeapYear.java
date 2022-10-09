import java.util.Scanner;

public class IsLeapYear {

    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        isLeapYear(year);

    }

    public static void isLeapYear(int year){

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0){
            System.out.println(year + " : Is Leap Year");
        } else {
            System.out.println(year + " : Non-Leap Year");
        }
    }
}

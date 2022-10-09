import java.util.Scanner;

public class OddEvenChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number one: ");
        int x = scanner.nextInt();
        evenNumber(x);

        System.out.print("Enter number two: ");
        int y = scanner.nextInt();
        oddNumber(y);

    }

    public static void evenNumber(int x){
        String even = (x % 2 == 0)? "It is an Even number" : "It is an Odd number";
        System.out.println(even);
    }

    public static void oddNumber(int y){
        String odd = (y % 2 != 0)? "It is an Odd number" : "It is an Even number";
        System.out.println(odd);
    }
}

public class GetAverage {

    public static void main(String[] args) {
        average(44,100,35,213,14);
    }

    public static void average(int num1, int num2, int num3, int num4, int num5){
        int total = num1 + num2 + num3 + num4 + num5;
        int avg = total / 5;
        System.out.println("Given numbers are: \n" + num1 + "\n" +
                num2 + "\n" + num3 + "\n" + num4 + "\n" + num5);
        System.out.println("Average is " + avg);
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double first = Double.parseDouble(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        System.out.println(new DecimalFormat("0.####").format(powerOfNum(first, second)));
    }

    private static double powerOfNum(double number, int power) {
        double result = Math.pow(number, power);
        return result;
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class problem_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();
        int second = Integer.parseInt(scan.nextLine());
        double result = 0;

        if (operation.equals("/")){
            result = division(first, second);
        } else if (operation.equals("-")){
            result = subtract(first, second);
        } else if (operation.equals("*")){
            result = multiply(first, second);
        } else if (operation.equals("+")){
            result = add(first, second);
        }
        System.out.println(new DecimalFormat("0.##").format(result));
    }

    private static double add(int first, int second) {
        return first + second;
    }

    private static double multiply(int first, int second) {
        return first * second;
    }

    private static double subtract(int first, int second) {
        return first - second;
    }

    private static double division(int first, int second) {
        return first * 1.0 / second;
    }
}

import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        
        double area = rectangleArea(a, b);
        System.out.printf("%.0f", area);
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }
}

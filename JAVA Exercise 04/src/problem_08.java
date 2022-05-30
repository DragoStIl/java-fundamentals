import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        factorialOfEachScan(first, second);
    }

    private static void factorialOfEachScan(int first, int second) {
        double firstFactorial = 1;
        double secondFactorial = 1;
        if (first > 0) {
            for (int i = first; i > 0; i--) {
                firstFactorial *= i;
            }
        }

        if (second > 0){
            for (int i = second; i > 0; i--) {
                secondFactorial *= i;
            }
        }
        divisionOfTheTwoFactorials(firstFactorial, secondFactorial);
    }

    private static void divisionOfTheTwoFactorials(double firstFactorial, double secondFactorial) {
        System.out.printf("%.2f", firstFactorial / secondFactorial);
    }
}

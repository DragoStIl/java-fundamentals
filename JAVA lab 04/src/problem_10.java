import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        System.out.println(sumOfEvenAndOdd(Math.abs(number)));
    }

    private static int sumOfEvenAndOdd(int sum) {
        int odd = sumOfOdd(sum);
        int even = sumOfEven(sum);
        return odd * even;
    }

    private static int sumOfEven(int evenSum) {
        int sum = 0;
        while (evenSum > 0){
            int even = evenSum % 10;
            if (even % 2 == 1){
                sum += even;
            }
            evenSum /= 10;
        }
        return sum;
    }

    private static int sumOfOdd(int oddSum) {
        int sum = 0;
        while (oddSum > 0){
            int odd = oddSum % 10;
            if (odd % 2 == 0){
                sum += odd;
            }
            oddSum /= 10;
        }
        return sum;
    }
}

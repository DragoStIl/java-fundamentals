import java.util.Arrays;
import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] index = scan.nextLine().split(" ");

        int[] numbers = new int[index.length];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(index[i]);
            if (numbers[i] % 2 == 0){
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }
        System.out.println(sumEven - sumOdd);
        // 1 2 3 4 5 6
    }
}

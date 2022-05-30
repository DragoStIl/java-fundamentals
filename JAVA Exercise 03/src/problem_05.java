import java.util.Arrays;
import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();


        int biggestNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            biggestNum = numbers[i];
            boolean checker = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){ ;
                    continue;
                } else {
                    checker = false;
                    break;
                }

            }
            if (checker){
                System.out.print(biggestNum + " ");
            }
        }
    }
}

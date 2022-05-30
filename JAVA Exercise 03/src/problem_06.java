import java.util.Arrays;
import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean haveIt = false;
        // 1 2 3 3

        for (int i = 0; i < numbers.length; i++) {
            int sumBefore = 0;
            int sumAfter = 0;
                for (int j = i - 1; j >= 0; j--) { // преди индекса
                    sumBefore += numbers[j];
            }
            for (int e = i + 1; e < numbers.length; e++) { // след-индекса
                sumAfter += numbers[e];
            }
            if (sumAfter == sumBefore){
                haveIt = true;
                System.out.println(i); //At a[2] -> left sum = 3, right sum = 3
            }
        }
        if (!haveIt){
            System.out.println("no");
        }
    }
}

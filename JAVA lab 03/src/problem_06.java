import java.util.Arrays;
import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        boolean equal = true;
        for (int i = 0; i < firstArray.length; i++) {
            sum += firstArray[i];
            if (firstArray[i] != secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                equal = false;
                break;
            }
        }
        if (equal){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}

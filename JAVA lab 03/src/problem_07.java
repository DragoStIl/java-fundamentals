import java.util.Arrays;
import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] holdThem = input;
        boolean biggerThenOne = true;

        if (input.length > 1){
            for (int i = 0; i < input.length - 1; i++) {
                int[] condensed = new int[input.length - (1 + i)];
                for (int j = 0; j < condensed.length; j++) {
                    condensed[j] = holdThem[j] + holdThem[j + 1];
                    holdThem[j] = condensed[j];
                }

            }
        } else {
            biggerThenOne = false;
            System.out.println(input[0]);
        }
        if (biggerThenOne){
            System.out.println(holdThem[0]);
        }
    }
}

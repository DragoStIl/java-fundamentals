import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayer.size() > 0 && secondPlayer.size() > 0) {
            int first = firstPlayer.get(0);
            int second = secondPlayer.get(0);
            firstPlayer.remove(0);
            secondPlayer.remove(0);
            if (first > second) {
                firstPlayer.add(first);
                firstPlayer.add(second);
            } else if (second > first) {
                secondPlayer.add(second);
                secondPlayer.add(first);
            }
        }
        int sum = 0;
        if (firstPlayer.isEmpty()){
            for (Integer integer : secondPlayer) {
                sum += integer;
            }
            System.out.println("Second player wins! Sum: " + sum);
        } else {
            for (Integer integer : firstPlayer) {
                sum += integer;
            }
            System.out.println("First player wins! Sum: " + sum);
        }
    }
}

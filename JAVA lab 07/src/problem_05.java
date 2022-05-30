import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        if (numbers.size() >=3) {
            for (int i = 0; i < 3; i++) {
                int num = numbers.get(i);
                System.out.print(num + " ");
            }
        } else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

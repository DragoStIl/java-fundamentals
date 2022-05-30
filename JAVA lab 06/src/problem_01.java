import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> words = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        Random rnd = new Random();

        while (!words.isEmpty()) {
            String word = (words.get(rnd.nextInt(words.size())));
            System.out.println(word);
            words.remove(word);

        }
    }
}

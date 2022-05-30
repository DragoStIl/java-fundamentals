import java.util.*;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\|");
        String hold = "";
        for (int i = input.length - 1; i >= 0; i--) {
            hold += input[i] + " ";
        }
        List<String> reverseInput = Arrays.asList(hold.split("\\s+"));
        System.out.println(reverseInput.toString().replaceAll("[\\[\\],]", "").trim());
    }
}

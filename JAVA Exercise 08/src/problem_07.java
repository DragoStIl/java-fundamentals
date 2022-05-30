import java.util.List;
import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder result = new StringBuilder(input);
        int range = 0;
        for (int i = 0; i < result.length(); i++) { // abv>1>1>2>2asdasd
            if (result.charAt(i) == '>'){
                range += Integer.parseInt(String.valueOf(result.charAt(i + 1)));

            } else if (range > 0 && result.charAt(i) != '>'){
                result.deleteCharAt(i);
                range--;
                i--;
            }
        }
        System.out.println(result);
    }
}

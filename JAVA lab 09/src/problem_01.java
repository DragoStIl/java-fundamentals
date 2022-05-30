import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String regex = "\\b[A-Z][a-z]+\\b \\b[A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);

        while(match.find()){
            System.out.print(match.group() + " ");
        }
    }
}

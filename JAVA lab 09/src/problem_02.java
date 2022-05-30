import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String regex = "[\\+][3][5][9]([ -])[2]\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);

        List<String> phones = new ArrayList<>();
        while(match.find()){
            phones.add(match.group());

            //System.out.print(match.group() + ", ");
        }
        System.out.println(phones.toString().replaceAll("[\\[\\]]", ""));
    }
}

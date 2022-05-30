import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String regex = "\\b(?<day>\\d{2})(?<separator>[\\.\\/\\-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);

        while(match.find()){
            String day = match.group("day");
            String month = match.group("month");
            String year = match.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamProblem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int count = Integer.parseInt(scan.nextLine());


        Pattern pattern = Pattern.compile("!(?<command>[A-Z][a-z]+)!:\\[(?<message>[A-Za-z]+)\\]");


        for (int j = 0; j < count; j++) {
            String command = scan.nextLine();
            Matcher matcher = pattern.matcher(command);
            if (matcher.find()) {
                String action = matcher.group("command");
                String message = matcher.group("message");

                if (action.length() >= 3 && message.length() >= 8) {
                    List<Integer> encrypted = new ArrayList<>();
                    for (int i = 0; i < message.length(); i++) {
                        char current = message.charAt(i);
                        encrypted.add((int) current);
                    }
                    System.out.println(action + ": " + encrypted.toString().replaceAll("[\\[\\],]", ""));

                } else {
                    System.out.println("The message is invalid");
                }
            } else {
                System.out.println("The message is invalid");

            }
        }
    }
}

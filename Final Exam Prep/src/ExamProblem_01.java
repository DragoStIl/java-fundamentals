import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExamProblem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder email = new StringBuilder(scan.nextLine());

        String commands = scan.nextLine();

        while(!commands.equals("Complete")){
            if ("Make Upper".equals(commands)) {
                String upperCase = email.toString().toUpperCase();
                email = new StringBuilder(upperCase);
                System.out.println(email);

            } else if ("Make Lower".equals(commands)) {
                String lowerCase = email.toString().toLowerCase();
                email = new StringBuilder(lowerCase);
                System.out.println(email);

            } else if ("GetUsername".equals(commands)) {
                StringBuilder username = new StringBuilder();
                int endIndex = 0;
                if (email.toString().contains("@")) {
                    for (int i = 0; i < email.length(); i++) {
                        char current = email.charAt(i);
                        if (current == '@') {
                            endIndex = i;
                        }
                    }
                    username.append(email, 0, endIndex);
                    System.out.println(username);
                } else {
                    System.out.printf("The email %s doesn't contain the @ symbol.%n", email);
                }

            } else if (commands.split(" ")[0].equals("GetDomain")) {
                int count = Integer.parseInt(commands.split(" ")[1]);
                int startIndex = email.length() - count;
                StringBuilder domain = new StringBuilder();
                domain.append(email, startIndex, email.length());
                System.out.println(domain);

            } else if (commands.equals("Encrypt")){
                List<Integer> encrypted = new ArrayList<>();
                for (int i = 0; i < email.length(); i++) {
                    char current = email.charAt(i);
                    encrypted.add((int)current);
                }
                encrypted.forEach(symbol -> System.out.print(symbol + " "));
                System.out.println();

            } else if (commands.split(" ")[0].equals("Replace")){
                String replace = commands.split(" ")[1];
                String newEmail = email.toString().replaceAll(replace, "-");
                email = new StringBuilder(newEmail);
                System.out.println(email);
            }


            commands = scan.nextLine();
        }
    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int messages = Integer.parseInt(scan.nextLine());

        Pattern pattern = Pattern.compile("@(?<planet>[A-Za-z]+)[^@!:>\\-]*:(?<population>[0-9]+)[^@!:>\\-]*!(?<type>[AD])![^@!:>\\-]*->(?<soldiers>[0-9]+)");
        List<String> destroyed = new ArrayList<>();
        List<String> attacked = new ArrayList<>();


        for (int i = 0; i < messages; i++) {
            String encrypted = scan.nextLine();
            String decrypted = decryptEnigmaInator(encrypted);

            Matcher matcher = pattern.matcher(decrypted);
            if (matcher.find()){
                if (matcher.group("type").equals("A")){
                    attacked.add(matcher.group("planet"));
                } else if (matcher.group("type").equals("D")){
                    destroyed.add(matcher.group("planet"));

                }
            }
        }
        System.out.println("Attacked planets: " + attacked.size());
        attacked.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
        System.out.println("Destroyed planets: " + destroyed.size());
        destroyed.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
    }

    private static String decryptEnigmaInator(String encrypted) {
        char[] chars = encrypted.toCharArray();
        int codeNum = 0;
        for (char current : chars) {
            switch (current) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    codeNum++;
                    break;
            }
        }
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encrypted.length(); i++) {
            char current = (char)(encrypted.charAt(i) - codeNum);
            decrypted.append(current);
        }
        return decrypted.toString();
    }
}

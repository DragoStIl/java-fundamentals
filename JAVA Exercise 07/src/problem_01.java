import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<Character, Integer> lettersCounter = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' '){
               char current = input.charAt(i);
                if (!lettersCounter.containsKey(current)){
                    lettersCounter.put(current, 1);
                } else {
                    lettersCounter.put(current, lettersCounter.get(current) + 1);
                }
            }
        }
        for (var entry : lettersCounter.entrySet()){
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}

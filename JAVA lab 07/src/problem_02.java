import java.util.*;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rotations = Integer.parseInt(scan.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < rotations; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            System.out.printf("%s -%s%n", entry.getKey(), entry.getValue().toString().replaceAll("[\\[\\]]", " "));
        }
    }
}

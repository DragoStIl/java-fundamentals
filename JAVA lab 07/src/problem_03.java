import java.util.*;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> wordCounter = new LinkedHashMap<>();

        String[] sequence = scan.nextLine().split("\\s+");
        for (String word : sequence) {
            String lowerCase = word.toLowerCase();

            if (!wordCounter.containsKey(lowerCase)){
                wordCounter.put(lowerCase, 1);
            } else {
                wordCounter.put(lowerCase, wordCounter.get(lowerCase) + 1);
            }
        }
        List<String> oddWords = new ArrayList<>();
        for (var entry : wordCounter.entrySet()) {
            if (entry.getValue() % 2 == 1){
                oddWords.add(entry.getKey());
            }
        }
        System.out.println(oddWords.toString().replaceAll("[\\[\\]]", ""));
    }
}

import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : input){
            for (int i = 0; i < word.length(); i++) {
                result.append(word);
            }
        }
        System.out.println(result);
    }
}

import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String magicWord = scan.nextLine();
        int repeatNumber = Integer.parseInt(scan.nextLine());

        String repeatedWord = repeat(magicWord, repeatNumber);
        System.out.println(repeatedWord);
    }

    private static String repeat(String word, int repeats) {
        StringBuilder sum = new StringBuilder();
        for (int i = 0; i < repeats; i++) {
            sum.append(word);
        }
        return sum.toString();
    }
}

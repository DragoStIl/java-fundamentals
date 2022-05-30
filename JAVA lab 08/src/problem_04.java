import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] badWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : badWords){
            if (text.contains(word)){
                text = textCensor(text, word);
            }
        }
        System.out.println(text);
    }

    private static String textCensor(String text, String word) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stars.append("*");
        }
        while (text.contains(word)){
            text = text.replace(word, stars.toString());
        }
        return text;
    }
}

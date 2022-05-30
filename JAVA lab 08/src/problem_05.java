import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //digits
        StringBuilder digits = new StringBuilder();
        //letters
        StringBuilder letters = new StringBuilder();
        //symbols
        StringBuilder symbols = new StringBuilder();

        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (Character.isDigit(current)){
                digits.append(current);
            } else if (Character.isLetter(current)){
                letters.append(current);
            } else {
                symbols.append(current);
            }
        }
        System.out.printf("%s%n%s%n%s%n", digits, letters, symbols);
    }
}

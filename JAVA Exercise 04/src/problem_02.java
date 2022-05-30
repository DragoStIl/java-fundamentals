import java.util.Locale;
import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine().toLowerCase();
        printVowelsCount(word);
    }

    private static void printVowelsCount(String vowelChecker){
        int counter = 0;
        for (int i = 0; i < vowelChecker.length(); i++) {
            char currentLetter = vowelChecker.charAt(i);
            switch (currentLetter){
                case ('a'):
                case ('o'):
                case ('u'):
                case ('e'):
                case ('i'):
                    counter++;
                    break;
            }
        }
        System.out.println(counter);
    }
}

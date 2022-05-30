import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        printFromSmallestChar(first, second);
    }

    private static void printFromSmallestChar(char first, char second) {
        if (first < second){
            printCharSequence(first, second);
        } else {
            printCharSequence(second, first);
        }
    }

    private static void printCharSequence(char smallestChar, char biggestChar) {
        for (int i = smallestChar + 1; i < biggestChar; i++) {
            char current = (char) i;
            System.out.print(current + " ");
        }
    }

}

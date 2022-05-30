import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        middleCharPrint(input);
    }

    private static void middleCharPrint(String input) {
        char middle = input.charAt(input.length() / 2);
        if (input.length() % 2 == 0){
            System.out.print(input.charAt((input.length() / 2) - 1));
            System.out.print(middle);
        } else {
            System.out.println(middle);
        }
    }
}

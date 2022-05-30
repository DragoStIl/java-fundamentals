import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("end")){
            StringBuilder reverseInput = new StringBuilder("");
            for (int i = input.length() - 1; i >= 0; i--) {
                reverseInput.append(input.charAt(i));
            }
            System.out.println(input + " = " + reverseInput.toString());

            input = scan.nextLine();
        }
    }
}

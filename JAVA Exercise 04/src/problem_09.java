import java.util.Scanner;

public class problem_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")){
            boolean palindrome = palindromeChecker(input);
            if (palindrome){
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scan.nextLine();
        }
    }

    private static boolean palindromeChecker(String input) {
        boolean same = true;
        int i = input.length() - 1;
        for (int k = 0; k < input.length() / 2; k++) {
            char first = input.charAt(k);
            char second = input.charAt(i);
            if (first != second){
                same = false;
            }
            i--;
        }
        return  same;
    }
}

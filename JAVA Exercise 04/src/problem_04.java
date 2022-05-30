import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String passwordInput = scan.nextLine();
        // от 6 до 10 символа
        // дали е само от букви и цифри - done
        // дали има поне 2 цифри - done

        boolean passLength = passwordLengthChecker(passwordInput);
        boolean passContent = passwordContentChecker(passwordInput);
        boolean twoDigitsCheck = digitsChecker(passwordInput);

        if (!passLength){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!passContent){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!twoDigitsCheck){
            System.out.println("Password must have at least 2 digits");
        }
        if (passLength && passContent && twoDigitsCheck){
            System.out.println("Password is valid");
        }

    }

    private static boolean passwordLengthChecker(String passwordInput) {
        return 6 <= passwordInput.length() && passwordInput.length() <= 10;
    }

    private static boolean passwordContentChecker(String passwordInput) {
        boolean digitsAndLettersOnly = true;
        for (int i = 0; i < passwordInput.length(); i++) {
            char current = passwordInput.charAt(i);
            if (!Character.isLetterOrDigit(current)){
                digitsAndLettersOnly = false;
            }
        }
        return digitsAndLettersOnly;
    }

    private static boolean digitsChecker(String passwordInput) {
        int counter = 0;
        for (int i = 0; i < passwordInput.length(); i++) {
            char current = passwordInput.charAt(i);
            if (Character.isDigit(current)){
                counter++;
            }
        }
        return counter >= 2;
    }
}

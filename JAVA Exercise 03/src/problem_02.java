import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstArray = scan.nextLine().split(" ");
        String[] secondArray = scan.nextLine().split(" ");

        for (String secondWord : secondArray) {
            for (String firstWord : firstArray) {
                if (secondWord.equals(firstWord)){
                    System.out.print(secondWord + " ");
                }
            }
        }
    }
}

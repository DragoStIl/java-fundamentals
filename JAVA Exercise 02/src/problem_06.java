import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        char firstChar = 'a';

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {
                    System.out.print((char) (firstChar + i));
                    System.out.print((char) (firstChar + j));
                    System.out.print((char) (firstChar + k));
                    System.out.println("");
                }
            }
        }
    }
}

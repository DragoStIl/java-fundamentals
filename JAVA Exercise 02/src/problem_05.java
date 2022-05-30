import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int last = Integer.parseInt(scan.nextLine());

        for (int i = first; i <= last; i++) {
            System.out.print((char) i + " ");
        }
    }
}

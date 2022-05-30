import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int metres = Integer.parseInt(scan.nextLine());
        double kilometres = metres / 1000.0;

        System.out.printf("%.2f", kilometres);

    }
}

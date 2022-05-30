import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());


        do {
            int sum = num * n;
            System.out.printf("%d X %d = %d%n", num, n, sum);
            n++;
        } while (n <= 10);
    }
}

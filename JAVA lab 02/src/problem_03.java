import java.math.BigDecimal;
import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal next = new BigDecimal(scan.nextLine());
            sum = sum.add(next);
        }
        System.out.println(sum);
    }
}

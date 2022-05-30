import java.math.BigInteger;
import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        char[] split = input.toCharArray();
        int multiplayer = Integer.parseInt(scan.nextLine());

        StringBuilder bigNumber = new StringBuilder();
        int overTen = 0;


        if (multiplayer > 0) {
            for (int i = split.length - 1; i >= 0; i--) {
                int current = Integer.parseInt(String.valueOf(split[i])) * multiplayer + overTen;
                if (current > 0) {
                    if (i > 0) {
                        bigNumber.append(current % 10);
                        overTen = current / 10;
                    } else {
                        bigNumber.append(current % 10);
                        if (current / 10 > 0) {
                            bigNumber.append(current / 10);
                        }
                    }
                } else {
                    bigNumber.append(0);
                }
            }
            System.out.println(bigNumber.reverse());
        } else {
            System.out.println(0);
        }
    }
}

import java.util.Scanner;

public class problem_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        boolean itIs = false;
        for (int i = 1; i <= num; i++) {
            int j = i;
            int sum = 0;
            while (j > 0) {
                int last = j % 10;
                sum += last;
                j = j / 10;
            }
            itIs = (sum == 5) || (sum == 7) || (sum == 11);
            if (itIs){
                System.out.println( i + " -> True");
            } else {
                System.out.println( i + " -> False");
            }

        }
    }
}

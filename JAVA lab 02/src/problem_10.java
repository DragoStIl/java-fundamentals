import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int j = i;
            while (j > 0){
                int lastDigit = j % 10;
                sum+=lastDigit;
                j /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.println(i + " ->" + " True");
            } else {
                System.out.println(i + " ->" + " False");
            }
        }
    }
}

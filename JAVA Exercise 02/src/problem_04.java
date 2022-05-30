import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lineNumbers = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < lineNumbers; i++) {
            char single = scan.nextLine().charAt(0);
            sum = sum + (int) single;

        }
        System.out.println("The sum equals: " + sum);
    }
}

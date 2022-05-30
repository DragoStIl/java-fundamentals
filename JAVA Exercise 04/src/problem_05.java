import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        sumFirstTwo(first, second, third);

    }

    private static void sumFirstTwo(int first, int second, int third) {
        int sum = first + second;
        subtractThird(sum, third);
    }

    private static void subtractThird(int sum, int third) {
        System.out.println(sum - third);
    }
}

import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        smallestNumberPrint(num1, num2, num3);
    }
    private static void smallestNumberPrint(int first, int second, int third) {
        if (first <= second && first <= third){
            System.out.println(first);
        } else if (second < first && second <= third){
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}

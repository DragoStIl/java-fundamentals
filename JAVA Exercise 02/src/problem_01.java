import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int fourth = Integer.parseInt(scan.nextLine());

        // ((first + second) * third) / fourth

        System.out.println(((first + second) / third) * fourth);

    }
}

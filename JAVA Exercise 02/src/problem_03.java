import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        double courses = Math.ceil(people * 1.0 / capacity);

        System.out.printf("%.0f", courses);
    }
}

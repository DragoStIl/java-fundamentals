import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagons = Integer.parseInt(scan.nextLine());
        int[] people = new int[wagons];
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            people[i] = Integer.parseInt(scan.nextLine());
            System.out.print(people[i] + " ");
            sum+=people[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}

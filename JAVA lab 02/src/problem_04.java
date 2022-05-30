import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Town Sofia has population of 1286383 and area 492 square km.

        String town = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        int area = Integer.parseInt(scan.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.", town, population, area);

    }
}

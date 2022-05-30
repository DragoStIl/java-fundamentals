import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPours = Integer.parseInt(scan.nextLine());
        int maxCapacity = 255;
        int sum = 0;
        for (int i = 0; i < numberOfPours; i++) {
            int puring = Integer.parseInt(scan.nextLine());
            sum += puring;
            if (sum > maxCapacity){
                System.out.println("Insufficient capacity!");
                sum -= puring;
            }
        }
        System.out.println(sum);
    }
}

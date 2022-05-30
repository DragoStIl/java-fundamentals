import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayRange = Integer.parseInt(scan.nextLine());

        int[] array = new int[arrayRange];
        for (int i = 0; i < arrayRange; i++) {
            array[i] = Integer.parseInt(scan.nextLine());
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

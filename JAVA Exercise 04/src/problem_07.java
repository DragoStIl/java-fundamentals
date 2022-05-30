import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magicNum = Integer.parseInt(scan.nextLine());
        matrixPrinter(magicNum);
    }

    private static void matrixPrinter(int magicNum) {
        for (int i = 0; i < magicNum; i++) {
            for (int j = 0; j < magicNum; j++) {
                System.out.print(magicNum + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int magicNum = Integer.parseInt(scan.nextLine());
        upHalf(magicNum);
        downHalf(magicNum);

    }



    private static void upHalf(int topPart) {
        for (int i = 1; i < topPart; i++) {
            printLine(i);
        }
    }




    private static void downHalf(int botPart) {
        for (int i = botPart; i >= 1; i--) {
            printLine(i);
        }
    }

    private static void printLine(int triangleLine) {
        for (int i = 1; i <= triangleLine; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

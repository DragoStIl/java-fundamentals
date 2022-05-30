import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] justArray = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstChar = justArray[0];
            for (int j = 0; j < justArray.length - 1; j++) {
                justArray[j] = justArray[j + 1];
            }
            justArray[justArray.length -1] = firstChar;
        }
        System.out.println(String.join(" ", justArray));
    }
}

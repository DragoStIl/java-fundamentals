import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rotations = Integer.parseInt(scan.nextLine());
        String[] firstArray = new String[rotations];
        String[] secondArray = new String[rotations];

        for (int i = 0; i < rotations; i++) {
            String[] temporary = scan.nextLine().split(" ");
            if ((i + 1) % 2 != 0){
                firstArray[i] = temporary[0];
                secondArray[i] = temporary[1];
            } else {
                firstArray[i] = temporary[1];
                secondArray[i] = temporary[0];
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}

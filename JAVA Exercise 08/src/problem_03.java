import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] directory = scan.nextLine().split("\\\\");
        String[] file = directory[directory.length -1].split("\\.");
        System.out.printf("File name: %s%nFile extension: %s%n", file[0], file[1]);

    }
}

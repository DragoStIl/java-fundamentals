import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char n = scan.nextLine().charAt(0);
        if (Character.isUpperCase(n)){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

    }
}

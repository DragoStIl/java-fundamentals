import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] idk = scan.nextLine().split(" ");
        for (int i = 0; i < idk.length / 2; i++) {
            String current = idk[i];
            idk[i] = idk[idk.length - 1 - i];
            idk[idk.length -1 - i]= current;

        }
        System.out.println(String.join(" ", idk));
        // e d c b a
        // a b c d e

    }
}

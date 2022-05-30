import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder noSequences = new StringBuilder().append(input.charAt(0));
        for (int i = 0; i < input.length() - 1; i++) {
           char current = input.charAt(i + 1);
            if (!(current == input.charAt(i))){
                noSequences.append(current);
            }
        }
        System.out.println(noSequences);
    }
}

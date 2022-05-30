import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        char[] first = input.split("\\s+")[0].toCharArray();
        char[] second = input.split("\\s+")[1].toCharArray();
        int sum = 0;
        if (second.length > first.length){
            sum = calculator (second, first);
        } else if (first.length > second.length){
            sum = calculator(first, second);
        } else {
            for (int i = 0; i < first.length; i++) {
                int one = first[i];
                int two = second[i];
                sum += first[i] * second[i];
            }
        }
        System.out.println(sum);

    }
    private static int calculator(char[] longer, char[] shorter){
        int sum = 0;
        for (int i = 0; i < shorter.length; i++) {
            sum += longer[i] * shorter[i];

        }
        for (int i = shorter.length; i < longer.length; i++) {
            sum += longer[i];
        }
        return sum;

    }
}

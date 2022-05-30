import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String action = scan.nextLine();
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        if (action.equals("add")){
            add(first, second);
        } else if (action.equals("multiply")){
            multiply(first, second);
        } else if (action.equals("subtract")){
            subtract(first, second);
        } else if (action.equals("divide")){
            divide(first, second);
        }
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }
}

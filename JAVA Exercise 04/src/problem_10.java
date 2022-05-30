import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= number; i++) {
            printTopNumbers(i);
        }
    }

    private static void printTopNumbers(int i) {
        // divisible by 8
        // if one of its digits is odd
        boolean divisibleBy_8 = division(i);
        boolean oddContent = odd(i);
        if (divisibleBy_8 && oddContent){
            System.out.println(i);
        }
    }

    private static boolean division(int number) {
        int sum = 0;
        while (number != 0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean odd(int i) {
        int counter = 0;
        while (i != 0){
            int lastDigit = i % 10;
            if (lastDigit % 2 != 0){
                counter++;
            }
            i /= 10;
        }
        return counter > 0;
    }
}

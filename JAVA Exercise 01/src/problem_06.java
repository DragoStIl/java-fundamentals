import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int operationNumber = number;
        int sum = 0;
        while (operationNumber != 0){
            // въртим последното докато остане нула
            int factOfLast = 1;
            // % делене, за да остане последното
            int last = operationNumber % 10;
            for (int i = last; i > 0; i--) {
                // умножаваме всяко число с предното
                factOfLast *= i;
            }
            // прибавяме към сумата
            sum += factOfLast;
            // / делене, за да махна последното
            operationNumber /= 10;
        }
        // проверка дали сумта на всички факториали е колкото цялото число "yes" "no"
        if (sum == number){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
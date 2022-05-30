import java.util.Arrays;
import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int magicNum = Integer.parseInt(scan.nextLine());

        for (int firstNum = 0; firstNum < numbers.length; firstNum++) {
            String[] magicArray = new String[2];
            for (int secondNum = firstNum + 1; secondNum < numbers.length; secondNum++) {
                if (numbers[firstNum] + numbers[secondNum] == magicNum){
                    magicArray[0] = String.valueOf(numbers[firstNum]);
                    magicArray[1] = String.valueOf(numbers[secondNum]);
                    System.out.println(String.join(" ", magicArray));
                }
            }
        }
    }
}

import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // {letter}{number}{letter}
        String[] input = scan.nextLine().split("\\s+");
        double sum = 0;
        for (String key : input) {
            char firstLetter = key.charAt(0);
            char secondLetter = key.charAt(key.length() - 1);
            double number = Integer.parseInt(key.substring(1, key.length() - 1));
            number = calculator(firstLetter, secondLetter, number);
            sum += number;
            // if input[0] is upperCase (number /= letter's position) : else (number * letter's position)
            // if input[input.length - 1] is upperCase (number - letter's position) : else (number + letter's position)
        }

        System.out.printf("%.2f", sum);

    }
    private static double calculator(char first, char second, double num){
        int firstNum = 0;
        int secondNum = 0;
        if (Character.isUpperCase(first)){
            firstNum = first - 64;
            num /= firstNum;
        } else {
            firstNum = first - 96;
            num *= firstNum;
        }

        if (Character.isUpperCase(second)){
            secondNum = second - 64;
            num -= secondNum;
        } else {
            secondNum = second - 96;
            num += secondNum;
        }
        return num;
    }
}

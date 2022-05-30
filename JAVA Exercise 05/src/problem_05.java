import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] specials = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int bombDigit = specials[0];
        int rangeOFExplosion = specials[1];

        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) == bombDigit){
                removeDigitsFromLeft(numbers, bombDigit, rangeOFExplosion, index);
                int bombIndex = numbers.indexOf(bombDigit);
                removeDigitsFromRight(numbers, bombDigit, rangeOFExplosion, bombIndex);
                index = -1;
                //numbers.removeAll(Collections.singleton(bombDigit));

            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void removeDigitsFromLeft(List<Integer> numbers, int bombDigit, int rangeOFExplosion, int bombIndex) {
        int startIndex = 0;
        int counter = 0;
        boolean bombIsFirst = false;
        if (bombIndex - rangeOFExplosion >= 0 && bombIndex > 0){
            startIndex = bombIndex - rangeOFExplosion;
        } else if (bombIndex > 0){
            startIndex = 0;
        } else {
            bombIsFirst = true;
        }
        if (!bombIsFirst) {
            while (counter < rangeOFExplosion && numbers.indexOf(bombDigit) > 0) {
                numbers.remove(startIndex);
                counter++;
            }
        }
    }

    private static void removeDigitsFromRight(List<Integer> numbers, int bombDigit, int rangeOFExplosion, int bombIndex) {
        int counter = 0;

        while (bombIndex < numbers.size() && counter <= rangeOFExplosion){

            counter++;
            numbers.remove(bombIndex);
        }
    }
}

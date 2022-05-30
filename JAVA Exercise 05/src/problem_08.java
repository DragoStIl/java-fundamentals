import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String > input = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] command = scan.nextLine().split("\\s+");

        while (!command[0].equals("3:1")){
            switch (command[0]){
                case ("merge"):
                    int startIndex = Integer.parseInt(command[1]);
                    int lastIndex = Integer.parseInt(command[2]);
                    StringBuilder merged = new StringBuilder();
                    if (startIndex < 0){
                        startIndex = 0;
                    }
                    if (lastIndex > input.size()){
                        lastIndex = input.size() - 1;
                    }
//                    boolean firstIsValid = validator(startIndex, input.size());
//                    boolean secondIsValid = validator(lastIndex, input.size());
                    merging(command, input);
                    break;
                case ("divide"):
                    int indexOfDivide = Integer.parseInt(command[1]);
                    int divider = Integer.parseInt(command[2]);
                    String word = input.get(indexOfDivide);
                    int part = word.length() / divider;
                    int start = 0;
                    input.remove(indexOfDivide);

                    for (int i = 1; i < divider; i++) {
                        input.add(indexOfDivide, word.substring(start, start + part));
                        start += part;
                        indexOfDivide++;
                    }
                    input.add(indexOfDivide, word.substring(start));
                    break;
            }

            command = scan.nextLine().split(" ");
        }
        System.out.println(String.join(" ", input));
    }

//    private static boolean validator(int index, int size) {
//        return;
//    }

    private static void merging(String[] command, List<String> words) {
        int startIndex = Integer.parseInt(command[1]);
        int lastIndex = Integer.parseInt(command[2]);
        StringBuilder merged = new StringBuilder();
        if (startIndex < 0){
            startIndex = 0;
        }
        if (lastIndex > words.size()){
            lastIndex = words.size() - 1;
        }

        if (startIndex >= 0 && startIndex < words.size() - 1 && lastIndex >= 0 && lastIndex < words.size() && startIndex < lastIndex) {
            for (int i = startIndex; i <= lastIndex; i++) {
                merged.append(words.get((i)));
            }

            for (int i = startIndex; i <= lastIndex; i++) {
                words.remove(startIndex);
            }
            words.add(startIndex, merged.toString());
        }
    }
}

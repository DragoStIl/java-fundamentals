import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] commands = scan.nextLine().split("\\s+");

        //•	Add {number} - add number at the end
        //•	Insert {number} {index} - insert number at given index
        //•	Remove {index} - remove that index
        //•	Shift left {count} - first number becomes last 'count' times
        //•	Shift right {count} - last number becomes first 'count' times

        while (!commands[0].equals("End")){
            switch(commands[0]){
                case("Add"):
                    numbers.add(Integer.parseInt(commands[1]));
                    break;
                case("Insert"):
                    int indexToInsert = Integer.parseInt(commands[2]);
                    if (0 <= indexToInsert && indexToInsert < numbers.size()){
                        numbers.add(indexToInsert, Integer.parseInt(commands[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case("Remove"):
                    int indexToRemove = Integer.parseInt(commands[1]);
                    if (0 <= indexToRemove && indexToRemove < numbers.size()){
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case("Shift"):
                    int shiftsCount = Integer.parseInt(commands[2]);
                    if (commands[1].equals("left")){
                        shiftLeft(numbers, shiftsCount);
                    } else if (commands[1].equals("right")){
                        shiftRight(numbers, shiftsCount);
                    }
                    break;
            }


            commands = scan.nextLine().split("\\s+");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
    public static void shiftLeft(List<Integer> workList, int shifts){
        for (int i = 0; i < shifts; i++) {
            int firstNum = workList.get(0);
            workList.add(firstNum);
            workList.remove(0);
        }
    }
    public static void shiftRight(List<Integer> workList, int shifts){
        for (int i = shifts; i > 0; i--) {
            int lastNum = workList.get(workList.size() - 1);
            workList.add(0, lastNum);
            workList.remove(workList.size()- 1);
        }
    }
}

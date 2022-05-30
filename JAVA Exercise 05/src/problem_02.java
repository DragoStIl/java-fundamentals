import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while(!command.equals("end")){
            String[] splitCommands = command.split(" ");
            int element = Integer.parseInt(splitCommands[1]);
            switch(splitCommands[0]){
                case("Delete"):
                    numbers.removeAll(Collections.singleton(element));
                    break;
                case("Insert"):
                    int position = Integer.parseInt(splitCommands[2]);
                    numbers.add(position, element);
                    break;
            }

            command = scan.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}

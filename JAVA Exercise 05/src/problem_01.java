import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        while(!command.equals("end")){
            String[] splitCommand = command.split(" ");
            if (splitCommand[0].equals("Add")){
                train.add(Integer.parseInt(splitCommand[1]));
            } else {
                int passengers = Integer.parseInt(splitCommand[0]);
                for (int i = 0; i < train.size(); i++) {
                    if (train.get(i) + passengers <= maxCapacity){
                        train.set(i, train.get(i) + passengers);
                        break;
                    }
                }
            }


            command = scan.nextLine();
        }
        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));
    }
}

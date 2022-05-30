import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> mainList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while(!input.equals("end")){

            //Add {number}: add a number to the end of the list
            //Remove {number}: remove a number from the list
            //RemoveAt {index}: remove a number at a given index
            //Insert {number} {index}: insert a number at a given index


            String[] command = input.split(" ");
            String keyword = command[0];
            int number = Integer.parseInt(command[1]);

            switch(keyword){
                case ("Add"):
                    mainList.add(number);
                    break;
                case ("Remove"):
                    mainList.remove(Integer.valueOf(number));
                    break;
                case ("RemoveAt"):
                    mainList.remove(number);
                    break;
                case ("Insert"):
                    int index = Integer.parseInt(command[2]);
                    mainList.add(index, number);
                    break;

            }

            input = scan.nextLine();
        }
        System.out.println(mainList.toString().replaceAll("[\\[\\],]", ""));
    }
}

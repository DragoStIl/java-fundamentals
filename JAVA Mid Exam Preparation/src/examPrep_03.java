import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class examPrep_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> twins = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] input = scan.nextLine().split("\\s+");

        int turns = 0;

//        boolean noMoreTwins = false;
//        boolean forfeit = false;

        while (!input[0].equals("end") && twins.size() > 0){
            turns++;
            int index1 = Integer.parseInt(input[0]);
            int index2 = Integer.parseInt(input[1]);

            if (index1 < 0 || index1 > twins.size() - 1
                    || index2 < 0 || index2 >= twins.size()
                    || index1 == index2){

                String penalty = "-" + turns + "a";
                twins.add(twins.size() / 2, penalty);
                twins.add(twins.size() / 2, penalty);
                System.out.println("Invalid input! Adding additional elements to the board");

            } else if (twins.get(index1).equals(twins.get(index2))){
                System.out.printf("Congrats! You have found matching elements - %s!%n", twins.get(index1));
                twins.removeAll(Collections.singleton(twins.get(index1)));

            } else {
                System.out.println("Try again!");
            }

            input = scan.nextLine().split("\\s+");
        }
        if (input[0].equals("end") && twins.size() > 0){
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", twins));
        } else if (twins.size() == 0){
            System.out.printf("You have won in %d turns!%n", turns);
        }

    }
}

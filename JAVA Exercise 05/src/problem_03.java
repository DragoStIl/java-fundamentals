import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scan.nextLine());
        List<String> peopleAtTheParty = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {

            String[] command = scan.nextLine().split(" ");
            if (command[2].equals("going!")){
                boolean noSuchName = true;
                for (String name : peopleAtTheParty) {
                    if (command[0].equals(name)){
                        noSuchName = false;
                        break;
                    }
                }
                if (noSuchName){
                    peopleAtTheParty.add(command[0]);
                } else {
                    System.out.printf("%s is already in the list!%n", command[0]);
                }
            } else if (command[2].equals("not")){
                boolean noSuchName = true;
                for (String name : peopleAtTheParty) {
                    if (command[0].equals(name)){
                        noSuchName = false;
                        break;
                    }
                }
                if (!noSuchName){
                    peopleAtTheParty.remove(command[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", command[0]);
                }
            }

        }
        for (String guest : peopleAtTheParty) {
            System.out.println(guest);
        }
    }
}

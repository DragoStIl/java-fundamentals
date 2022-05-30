package problem_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] info = scan.nextLine().split("\\s+");
        List<People> group = new ArrayList<>();

        while (!info[0].equals("End")){
            People human = new People(info[0], info[1], Integer.parseInt(info[2]));
            group.add(human);

            info = scan.nextLine().split("\\s+");
        }
        group.sort(Comparator.comparing(People::getAge));
        for (People people : group) {
            System.out.println(people);
        }
    }
}

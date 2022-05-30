import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class examPrep_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> mainList = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] commands = scan.nextLine().split("\\s+");

        while (!commands[0].equals("end")){

            switch (commands[0]){
                case("swap"):
                    int index1 = Integer.parseInt(commands[1]);
                    int index2 = Integer.parseInt(commands[2]);
                    Collections.swap(mainList, index1, index2);
                    break;
                case("multiply"):
                    index1 = Integer.parseInt(commands[1]);
                    index2 = Integer.parseInt(commands[2]);
                    mainList.set(index1, mainList.get(index1) * mainList.get(index2));
                    //mainList.set(mainList.get(index1), mainList.get(index1) * mainList.get(index2));
                    break;
                case("decrease"):
                    for (int i = 0; i < mainList.size(); i++) {
                        mainList.set(i, mainList.get(i) - 1);
                    }
                    break;
            }


            commands = scan.nextLine().split("\\s+");
        }
        System.out.println(mainList.toString().replaceAll("[\\[\\]]", ""));
    }
}

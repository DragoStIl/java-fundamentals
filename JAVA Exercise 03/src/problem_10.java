import java.util.Arrays;
import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arraySize = Integer.parseInt(scan.nextLine());
        int[] fieldSize = new int[arraySize];

        int[] ladyBugs = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int ladyBugPlace : ladyBugs) {
            if (ladyBugPlace < fieldSize.length && ladyBugPlace >= 0){
                fieldSize[ladyBugPlace] = 1;
            }
        }
        String command = scan.nextLine();
        while (!command.equals("end")) {
            String[] keyWords = command.split(" ");
            int location = Integer.parseInt(keyWords[0]);
            String direction = keyWords[1];
            int relocation = Integer.parseInt(keyWords[2]);

            if (location < fieldSize.length && location >= 0 && fieldSize[location] == 1){
                fieldSize[location] = 0; // калинката е излетяла от мястото

                if (direction.equals("right")){
                    location += relocation;
                    // продължава да лети докато не намери празно място или не излети от полето;
                    while (location < fieldSize.length && location >= 0 && fieldSize[location] == 1){
                        location += relocation;
                    }
                    // ако намери празно място и то не е извън полето;
                    if (location < fieldSize.length && location >= 0 && fieldSize[location] == 0){
                        fieldSize[location] = 1;
                    }

                }else if (direction.equals("left")){
                    location -= relocation;

                    while (location < fieldSize.length && location >= 0 && fieldSize[location] == 1){
                        location -= relocation;
                    }

                    if (location < fieldSize.length && location >= 0 && fieldSize[location] == 0){
                        fieldSize[location] = 1;
                    }
                }
            }

            command = scan.nextLine();
        }
        for (int i : fieldSize) {
            System.out.print(i + " ");
        }
    }
}


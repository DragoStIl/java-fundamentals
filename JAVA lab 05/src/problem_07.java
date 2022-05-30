import java.util.*;
import java.util.stream.Collectors;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> mainList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        mainList.removeIf(n -> n < 0);
        Collections.reverse(mainList);
        if (mainList.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println(mainList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class examPrep_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> mainList = Arrays.stream(scan.nextLine().split("\\s"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        for (Integer integer : mainList) {
            sum += integer;
        }
        double average = sum * 1.0 / mainList.size();

        List<Integer> aboveAverage = new ArrayList<>();

        for (Integer currentNum : mainList) {
            if (currentNum > average){
                aboveAverage.add(currentNum);
            }
        }
        Collections.sort(aboveAverage);
        Collections.reverse(aboveAverage);


        if (aboveAverage.size() >= 5){
            for (int i = 0; i < 5; i++) {
                System.out.print(aboveAverage.get(i) + " ");
            }
        } else if(aboveAverage.size() > 0){
            System.out.println(aboveAverage.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("No");
        }
    }
}

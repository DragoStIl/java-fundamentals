import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int shortestList = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < shortestList; i++) {
            System.out.print(firstList.get(i) + " ");
            System.out.print(secondList.get(i) + " ");
        }
        if (firstList.size() > secondList.size()){
            printCombinedList(firstList, secondList);
        } else {
            printCombinedList(secondList, firstList);
        }
    }
    
    
    public static void printCombinedList(List<Integer> longest, List<Integer> shortest){
        for (int i = shortest.size(); i < longest.size(); i++) {
            System.out.print(longest.get(i) + " ");
        }
    }
}

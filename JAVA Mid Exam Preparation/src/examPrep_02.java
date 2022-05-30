import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class examPrep_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scan.nextLine());

        List<Integer> peopleOnTheLift = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // пресмятам общия брой свободни места
        int liftSpaces = peopleOnTheLift.size() * 4;
        int peopleSum = 0;

        for (Integer wagon : peopleOnTheLift) {
            peopleSum += wagon;
        }

        liftSpaces -= peopleSum;

        // докато има хора на опашката и има свободни места въртя вагоните

        boolean noMorePeople = false;
        boolean noMoreSpace = false;

        for (int i = 0; i < peopleOnTheLift.size(); i++) {
            int wagonSpace = 4 - peopleOnTheLift.get(i);

            if (peopleInQueue > wagonSpace) {
                peopleInQueue -= wagonSpace;
                liftSpaces -= wagonSpace;
                peopleOnTheLift.set(i, peopleOnTheLift.get(i) + wagonSpace);
            } else if (peopleInQueue <= wagonSpace){
                peopleOnTheLift.set(i, peopleOnTheLift.get(i) + peopleInQueue);
                liftSpaces -= peopleInQueue;
                peopleInQueue = 0;
                noMorePeople = true;
            }
            if (liftSpaces <= 0){
                noMoreSpace = true;
            }
        }

        if (noMorePeople && !noMoreSpace){
            System.out.println("The lift has empty spots!");
            System.out.println(peopleOnTheLift.toString().replaceAll("[\\[\\],]", ""));
        } else if (!noMorePeople && noMoreSpace){
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
            System.out.println(peopleOnTheLift.toString().replaceAll("[\\[\\],]", ""));
        } else if (noMorePeople && noMoreSpace){
            System.out.println(peopleOnTheLift.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> mainList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scan.nextLine().split(" ");

        //Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
        //Print even – print all the numbers that are even separated by a space
        //Print odd – print all the numbers that are odd separated by a space
        //Get sum – print the sum of all the numbers
        //Filter ({condition} {number}) – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="


        while(!command[0].equals("end")){
            String keyword = command[0];
            switch (keyword){
                case("Contains"):
                    int number = Integer.parseInt(command[1]);
                    boolean haveIt = false;
                    for (Integer i : mainList) {
                        if (i == number){
                            haveIt = true;
                        }
                    }
                    if (haveIt){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case("Print"):
                    if (command[1].equals("even")){
                        for (Integer i : mainList) {
                            if (i % 2 == 0){
                                System.out.print(i + " ");
                            }
                        }
                    } else if (command[1].equals("odd")){
                        for (Integer i : mainList) {
                            if (i % 2 == 1){
                                System.out.print(i + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case("Get"):
                    int sum = 0;
                    for (Integer i : mainList) {
                        sum += i;
                    }
                    System.out.println(sum);
                    break;
                case("Filter"):
                    String action = command[1];
                    int keyNum = Integer.parseInt(command[2]);
                    if (action.equals("<")){
                        for (Integer j : mainList) {
                            if (j < keyNum){
                                System.out.print(j + " ");
                            }
                        }
                    } else if (action.equals("<=")){
                        for (Integer j : mainList) {
                            if (j <= keyNum){
                                System.out.print(j + " ");
                            }
                        }
                    } else if (action.equals(">")){
                        for (Integer j : mainList) {
                            if (j > keyNum){
                                System.out.print(j + " ");
                            }
                        }
                    } else if (action.equals(">=")){
                        for (Integer j : mainList) {
                            if (j >= keyNum){
                                System.out.print(j + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

            }
            command = scan.nextLine().split(" ");
        }
    }
}

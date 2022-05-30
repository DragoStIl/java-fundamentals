import java.util.Arrays;
import java.util.Scanner;

public class examProblem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] items = Arrays.stream(scan.nextLine().split("\\,\\s+")).mapToInt(Integer::parseInt).toArray();
        int breakPoint = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();

        int rightSum = 0;
        int leftSum = 0;
        if (type.equals("expensive")) {
            for (int toRight = breakPoint +1; toRight < items.length; toRight++) {
                if (items[toRight] >= items[breakPoint]) {
                    rightSum += items[toRight];
                }
            }
            for (int toLeft = 0; toLeft < breakPoint; toLeft++) {
                if (items[toLeft] >= items[breakPoint]) {
                    leftSum += items[toLeft];
                }
            }
        } else if (type.equals("cheap")){
            for (int toRight = breakPoint +1; toRight < items.length; toRight++) {
                if (items[toRight] < items[breakPoint]) {
                    rightSum += items[toRight];
                }
            }
            for (int toLeft = 0; toLeft < breakPoint; toLeft++) {
                if (items[toLeft] < items[breakPoint]) {
                    leftSum += items[toLeft];
                }
            }
        }

        if (leftSum < rightSum){
            System.out.println("Right - " + rightSum);
        } else {
            System.out.println("Left - " + leftSum);
        }
    }
}

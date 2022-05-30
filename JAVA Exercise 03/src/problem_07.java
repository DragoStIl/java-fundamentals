import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] same = scan.nextLine().split(" ");

        String positionOfBiggest = "";
        int biggestCounter = Integer.MIN_VALUE;

        for (int i = 1; i < same.length; i++) {
            int equalsCounter = 0;
            for (int j = 0; j < i; j++) {
                if (same[j].equals(same[i])){
                    equalsCounter++;

                } else {
                    equalsCounter = 0;
                }
            }
            if (equalsCounter > biggestCounter){
                biggestCounter = equalsCounter;
                positionOfBiggest = same[i];
            }
        }
        for (int i = 0; i <= biggestCounter; i++) {
            System.out.print(positionOfBiggest + " ");
        }
        // 2 1 1 2 3 3 2 2 2 2
    }
}

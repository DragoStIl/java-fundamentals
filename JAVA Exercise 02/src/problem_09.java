import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class problem_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingSource = Integer.parseInt(scan.nextLine());
        int daysCount = 0;
        int totalAmount = 0;

        while (startingSource >= 100){
            int clearAmount = startingSource - 26;
            totalAmount += clearAmount;
            startingSource -= 10;
            daysCount++;
        }
        if (totalAmount >= 26){
            totalAmount -= 26;
        }
        System.out.println(daysCount);
        System.out.println(totalAmount);
    }
}

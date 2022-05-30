import java.text.DecimalFormat;
import java.util.Scanner;

public class examProblem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double expBar = Double.parseDouble(scan.nextLine());
        int battles = Integer.parseInt(scan.nextLine());

        // every third = +15% exp of earned
        // every fifth = -10% exp of earned
        // every 15 = +5% exp of earned (15 - 10)

        double sumEarned = 0;
        int battlesCount = 0;

        boolean nextLevel = false;

        for (int i = 1; i <= battles; i++) {
            battlesCount = i;
            double exp = Double.parseDouble(scan.nextLine());
            if (i % 15 == 0) {
                sumEarned += exp + (exp * 0.05);
            } else if (i % 3 == 0){
                sumEarned += exp + (exp * 0.15);
            } else if (i % 5 == 0){
                sumEarned += exp - (exp * 0.10);
            } else {
                sumEarned += exp;
            }

            if (sumEarned >= expBar){
                nextLevel = true;
                break;
            }
        }
        if (nextLevel){
            System.out.printf("Player successfully collected his needed experience for %d battles.", battlesCount);
        } else {
//            DecimalFormat df = new DecimalFormat("0.##");
            double difference = expBar - sumEarned;
//
//            System.out.println("Player was not able to collect the needed experience, " + df.format(difference) + " more needed.");
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", difference);
        }
    }
}

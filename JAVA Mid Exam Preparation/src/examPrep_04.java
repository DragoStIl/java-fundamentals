import java.util.Scanner;

public class examPrep_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int questionsPerHour = 0;
        for (int i = 0; i < 3; i++) {
            questionsPerHour += Integer.parseInt(scan.nextLine());
        }

        int students = Integer.parseInt(scan.nextLine());

        int hoursCounter = 0;
        while (students > 0){
            hoursCounter++;

            // на всеки четвърти час почиват
            if (hoursCounter % 4 == 0){
                continue;
            }

            if (students > questionsPerHour){
                students -= questionsPerHour;
            } else {
                students = 0;
            }
        }

        System.out.printf("Time needed: %dh.", hoursCounter);
    }
}

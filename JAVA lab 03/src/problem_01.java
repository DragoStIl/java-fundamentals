import java.time.MonthDay;
import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = Integer.parseInt(scan.nextLine());
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        if (day >= 1 && day <= 7){
            System.out.println(daysOfWeek[day-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}

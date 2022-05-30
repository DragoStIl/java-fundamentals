import java.util.Scanner;

public class problem07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        int ticket = 0;

        if (day.equals("Weekday")){
            if (0 <= age && age <= 18){
                ticket += 12;
            } else if (18 < age && age <= 64){
                ticket += 18;
            } else if (64 < age && age <= 122){
                ticket += 12;
            } else {
                System.out.println("Error!");
                return;
            }
        } else if (day.equals("Weekend")){
            if (0 <= age && age <= 18){
                ticket += 15;
            } else if (18 < age && age <= 64){
                ticket += 20;
            } else if (64 < age && age <= 122){
                ticket += 15;
            } else {
                System.out.println("Error!");
                return;
            }
        } else if (day.equals("Holiday")){
            if (0 <= age && age <= 18){
                ticket += 5;
            } else if (18 < age && age <= 64){
                ticket += 12;
            } else if (64 < age && age <= 122){
                ticket += 10;
            } else {
                System.out.println("Error!");
                return;
            }
        }
        System.out.printf("%d$", ticket);
    }
}

import java.util.Scanner;

public class problem_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double saberPrice = Double.parseDouble(scan.nextLine());
        double robePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());

        // price for equip = saberPrice * Math.ciel(students * 1.1) + robePrice * students + beltPrice * students
        // if money > of equip price
        // every 6th belt is free !!!!!
        // every price rounded to 2 digits !!!!!

        double sabers = saberPrice * Math.ceil(students * 1.1);
        double robes = robePrice * students;
        double belts = 0;
        int discount = 0;
        if (students >= 6){
            discount = students / 6;
            belts = (students - discount) * beltPrice;
        } else {
            belts = students * beltPrice;
        }

        double sum = belts + robes + sabers;

        if (money >= sum){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - money);
        }

    }
}

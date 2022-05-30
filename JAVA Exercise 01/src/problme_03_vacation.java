import java.util.Scanner;

public class problme_03_vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Student - 8.45; 9.80; 10.46 (>= 30 = -15% final price)
        //Business  - 10.90; 15.60; 16 (>= 100 = 10 people free)
        //Regular - 15; 20; 22.50 (10 <= people <= 20 = -5% final price)

        int people = Integer.parseInt(scan.nextLine());
        String peopleType = scan.nextLine();
        String dayType = scan.nextLine();

        double thePrice = 0;
        double finalPrice = 0;

        // if student/business/regular
        if (peopleType.equals("Students")){
            if (dayType.equals("Friday")){
                thePrice = 8.45;
            } else if (dayType.equals("Saturday")){
                thePrice = 9.80;
            } else if (dayType.equals("Sunday")){
                thePrice = 10.46;
            }
            finalPrice = people * thePrice;
            if (people >= 30) {
                finalPrice = finalPrice * 0.85;
            }
        } else if (peopleType.equals("Business")){
            if (dayType.equals("Friday")){
                thePrice = 10.90;
            } else if (dayType.equals("Saturday")){
                thePrice = 15.60;
            } else if (dayType.equals("Sunday")){
                thePrice = 16;
            }

            if (people >= 100) {
                people -= 10;
            }
            finalPrice = people * thePrice;
        } else if (peopleType.equals("Regular")){
            if (dayType.equals("Friday")){
                thePrice = 15;
            } else if (dayType.equals("Saturday")){
                thePrice = 20;
            } else if (dayType.equals("Sunday")){
                thePrice = 22.50;
            }
            finalPrice = people * thePrice;
            if (10 <= people && people <= 20){
                finalPrice = finalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", finalPrice);
    }
}

import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // available coins: 0.1, 0.2, 0.5, 1, 2
        // products: "Nuts" - 2.0, "Water" - 0.7, "Crisps" - 1.5, "Soda" - 0.8, "Coke" - 1.0.

        String general = scan.nextLine();
        double sum = 0;
        // "while" за пари докато не получа "Start"
        while (!general.equals("Start")){
            double money = Double.parseDouble(general);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2){
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f%n",money);
            }
            general = scan.nextLine();
        }
        general = scan.nextLine();
        // "while" за покупки докато не получа "End"
        while (!general.equals("End")){
            double price = 0;
            if (general.equals("Nuts")){
                price = 2;
            } else if (general.equals("Water")){
              price = 0.7;
            } else if (general.equals("Crisps")){
                price = 1.5;
            } else if (general.equals("Soda")){
                price = 0.8;
            } else if (general.equals("Coke")){
                price = 1;
            } else {
                System.out.println("Invalid product");
                general = scan.nextLine();
                continue;
            }
            if (price <= sum){
                System.out.println("Purchased " + general);
                sum -= price;
            } else {
                System.out.println("Sorry, not enough money");
            }
            general = scan.nextLine();
        }
        // принтвам колко остават
        System.out.printf("Change: %.2f", sum);
    }
}

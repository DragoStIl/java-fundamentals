import java.util.Scanner;

public class examPrep_01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String clientType = scan.nextLine();
        double sumWithoutTaxes = 0;

        while (!clientType.equals("special") && !clientType.equals("regular")){
            double priceWithoutTaxes = Double.parseDouble(clientType);
            if (priceWithoutTaxes < 0){
                System.out.println("Invalid price!");
            } else {
                sumWithoutTaxes += priceWithoutTaxes;
            }


            clientType = scan.nextLine();
        }
        double taxes = sumWithoutTaxes * 0.2;
        double finalSum = sumWithoutTaxes + taxes;

        if (clientType.equals("special")){
            finalSum *= 0.9;
        }

        if (finalSum > 0){
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sumWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", finalSum);
        } else {
            System.out.println("Invalid order!");
        }
    }
}

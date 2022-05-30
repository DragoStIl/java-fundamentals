import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        double price = priceAnnouncing(product);;
        
        //	coffee – 1.50
        //	water – 1.00
        //	coke – 1.40
        //	snacks – 2.00

        calculationPrice(price, quantity);
        
    }

    private static void calculationPrice(double price, int quantity) {
        System.out.printf("%.2f", price * quantity);
    }

    private static double priceAnnouncing(String productName) {
        double productPrice = 0;
        if (productName.equals("coffee")){
            productPrice = 1.5;
        } else if (productName.equals("water")){
            productPrice = 1;
        } else if (productName.equals("coke")){
            productPrice = 1.4;
        } else if (productName.equals("snacks")){
            productPrice = 2;
        }
        return productPrice;
    }
}

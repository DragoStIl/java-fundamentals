import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> quantities = new LinkedHashMap<>();
        Map<String, Double> prices = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("buy")){
            String product = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            if (!quantities.containsKey(product)){
                quantities.put(product, quantity);
                prices.put(product, price);
            } else {
                quantities.put(product, quantities.get(product) + quantity);
                prices.put(product, price);
            }

            input = scan.nextLine();
        }
        for (var entry : prices.entrySet()){
            String product = entry.getKey();
            double finalPrice = entry.getValue() * quantities.get(product);
            System.out.printf("%s -> %.2f%n", entry.getKey(), finalPrice);
        }
    }
}

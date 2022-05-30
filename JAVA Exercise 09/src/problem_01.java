import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();

        double spend = 0;
        List<String> bought = new ArrayList<>();
        while (!input.equals("Purchase")){
            Pattern pattern = Pattern.compile(">>(?<furniture>[A-Z]+[a-z]*)<<(?<money>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("money"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                spend += price * quantity;
                bought.add(furniture);
            }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String current : bought) {
            System.out.println(current);
        }
        System.out.printf("Total money spend: %.2f", spend);
    }
}

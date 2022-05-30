import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();

        Map<String, Double> mining = new LinkedHashMap<>();
        while (!resource.equals("stop")){
            double quantity = Double.parseDouble(scan.nextLine());
            if (!mining.containsKey(resource)){
                mining.put(resource, quantity);
            } else {
                mining.put(resource, mining.get(resource) + quantity);
            }
            resource = scan.nextLine();
        }
        for (var entry : mining.entrySet()){
            DecimalFormat dcm = new DecimalFormat("0.#####");
            System.out.printf("%s -> %s%n", entry.getKey(), dcm.format(entry.getValue()));
        }
    }
}

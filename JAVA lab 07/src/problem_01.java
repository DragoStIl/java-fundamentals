import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.DoubleStream;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> counter = new TreeMap<>();

        for (double current : input) {
            if (!counter.containsKey(current)) {
                counter.put(current, 1);
            } else {
                counter.put(current, counter.get(current) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : counter.entrySet()) {
            DecimalFormat dcm = new DecimalFormat("0.##");
            System.out.printf("%s -> %d%n", dcm.format(entry.getKey()), entry.getValue());
        }
    }
}

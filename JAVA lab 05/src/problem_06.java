import java.util.*;

public class problem_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());
        List<String> collector = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String product = scan.nextLine();
            collector.add(product);
        }
        Collections.sort(collector);
        for (int i = 0; i < collector.size(); i++) {
            System.out.println(i + 1 + "." + collector.get(i));
        }
    }
}

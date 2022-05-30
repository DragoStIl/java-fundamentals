import java.math.BigDecimal;
import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustFactor = Integer.parseInt(scan.nextLine());

        // Е - Д, докато Е >= Д;
        // ако Е == Е / 2 -> Е / Умора;
        // ако Е не може да стане точно Е / 2 -> прескачаме / Умора и пак вадим Д от Е;

        int value = energy;
        double half = energy / 2.0;
        int pokes = 0;

        while (value >= distance){
            if (value == half && exhaustFactor != 0){
                value = value / exhaustFactor;
            }
            if (value >= distance){
                value -= distance;
                pokes++;
            }
        }
        System.out.println(value);
        System.out.println(pokes);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> demons = Arrays.stream(scan.nextLine().split("[, ]+")).sorted(String::compareTo)
                .collect(Collectors.toList());

        Pattern healthRegex = Pattern.compile("([^\\d+\\-*.\\/])");
        Pattern damageRegex = Pattern.compile("(-?\\d+\\.?\\d*)");
        Pattern operation = Pattern.compile("([*/])");

        for (String demon : demons) {


            Matcher healthSymbol = healthRegex.matcher(demon);
            int health = 0;
            while (healthSymbol.find()){
                health += healthSymbol.group(1).charAt(0);
            }

            Matcher damageSymbol = damageRegex.matcher(demon);
            double damage = 0;
            while (damageSymbol.find()){
                damage += Double.parseDouble(damageSymbol.group(1));
            }

            Matcher action = operation.matcher(demon);
            while (action.find()){
                if (action.group().equals("*")){
                    damage *= 2;
                } else if (action.group().equals("/")){
                    damage /=2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);

        }

    }
}

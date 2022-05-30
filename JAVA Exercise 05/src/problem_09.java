import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        List<Integer> pokemons = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        while(pokemons.size() > 0){
            int target = Integer.parseInt(scan.nextLine());
            int currentElement = -1;

            if (target < 0){
                currentElement = pokemons.remove(0);
                pokemons.add(0, pokemons.get(pokemons.size()- 1));
            }else if (target > pokemons.size() - 1){
                currentElement = pokemons.remove(pokemons.size() - 1);
                pokemons.add(pokemons.get(0));
            } else {
                currentElement = pokemons.remove(target);

            }
            sum += currentElement;

            for (int i = 0; i < pokemons.size(); i++) {
                if (pokemons.get(i) <= currentElement){
                    pokemons.set(i, pokemons.get(i) + currentElement);
                } else {
                    pokemons.set(i, pokemons.get(i) - currentElement);
                }
            }
        }
        System.out.println(sum);
    }
}

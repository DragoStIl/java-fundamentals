import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class examProblem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> genres = Arrays.stream(scan.nextLine().split("\\s+\\|+\\s+")).collect(Collectors.toList());

        String[] commands = scan.nextLine().split("\\s+");

        while (!commands[0].equals("Stop!")){
            switch (commands[0]){
                case ("Join"):
                    boolean cantJoin = existingGenre(commands[1], genres);
                    if (!cantJoin){
                        genres.add(commands[1]);
                    }
                    break;
                case("Drop"):
                    boolean canDrop = existingGenre(commands[1], genres);
                    if (canDrop){
                        genres.remove(commands[1]);
                    }
                    break;
                case("Replace"):
                    boolean first = false;
                    boolean second = false;
                    int posOfFirst = 0;
                    for (int i = 0; i < genres.size(); i++) {
                        if (genres.get(i).equals(commands[1])){
                            first = true;
                            posOfFirst = i;
                        }
                        if (genres.get(i).equals(commands[2])){
                            second = true;
                        }
                    }
                    if (first && !second){
                        genres.set(posOfFirst, commands[2]);
                    }
                    break;
            }


            commands = scan.nextLine().split("\\s+");
        }

        System.out.println(String.join(" ", genres));
    }

    public static boolean existingGenre(String genre, List<String> genres){

        for (String s : genres) {
            if (s.equals(genre)){
                return true;
            }
        }
        return false;
    }
}

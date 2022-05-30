import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamProblem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();


        // input -> {animal} {needed food} {area}
        //map -> animal, food
        Map<String, Integer> animalsFood = new TreeMap<>();

        //map -> List<Area>, animal
        Map<String, List<String>> hungryAnimals = new TreeMap<>();

        while (!input.equals("EndDay")){
            String[] split = input.split(": ");
            switch (split[0]){
                case "Add":

                    String[] info = split[1].split("-");
                        String animal = info[0];
                        int neededFood = Integer.parseInt(info[1]);
                        String area = info[2];

                        if (!(animalsFood.containsKey(animal))){
                            animalsFood.put(animal, neededFood);
                            if (!(hungryAnimals.containsKey(area))) {
                                hungryAnimals.put(area, new ArrayList<>());
                            }
                            hungryAnimals.get(area).add(animal);
                        } else {
                            animalsFood.put(animal, animalsFood.get(animal) + neededFood);

                        }
                    break;
                case "Feed":

                    String[] feedInfo = split[1].split("-");
                        String animalToFeed = feedInfo[0];
                        int feed = Integer.parseInt(feedInfo[1]);

                        if (animalsFood.containsKey(animalToFeed)){
                            animalsFood.put(animalToFeed, animalsFood.get(animalToFeed) - feed);
                            if (animalsFood.get(animalToFeed) <= 0){
                                animalsFood.remove(animalToFeed);
                                hungryAnimals.forEach((key, value) -> value.remove(animalToFeed));
                                System.out.println(animalToFeed + " was successfully fed");
                            }
                        }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println("Animals:");
        animalsFood.entrySet().stream().sorted((a1, a2) -> Integer.compare(a2.getValue(), a1.getValue()))
                .forEach(animal -> System.out.println(" " + animal.getKey() + " -> " + animal.getValue() + "g"));

        System.out.println("Areas with hungry animals:");
        hungryAnimals.entrySet().stream().sorted((z1, z2) -> Integer.compare(z2.getValue().size(), z1.getValue().size()))
                .filter(zone -> zone.getValue().size() > 0)
                .forEach(area -> System.out.println(" " + area.getKey() + ": " + area.getValue().size()));
    }
}

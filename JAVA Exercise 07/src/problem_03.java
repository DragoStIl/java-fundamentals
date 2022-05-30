import java.awt.image.ImageProducer;
import java.util.*;
import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toMap;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // 	Shadowmourne - requires 250 Shards
        //	Valanyr - requires 250 Fragments
        //	Dragonwrath - requires 250 Motes

        Map<String, Integer> needed = new TreeMap<>();
        needed.put("shards", 0);
        needed.put("fragments", 0);
        needed.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();

        // mats = i % 2 == 0
        // quantity = i % 2 == 1

        List<String> input = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());


        while (input.size() > 0) {
            int quantity = Integer.parseInt(input.get(0));
            String material = input.get(1).toLowerCase();
            input.remove(1);
            input.remove(0);

            // check if the mat equals needed or junk
            if (needed.containsKey(material)) {
                needed.put(material, needed.get(material) + quantity);

                // check if mats are enough for legendary;
                if (needed.get(material) >= 250) {
                    needed.put(material, needed.get(material) - 250);
                    if (material.equals("shards")) {
                        System.out.println("Shadowmourne obtained!");
                    } else if (material.equals("fragments")) {
                        System.out.println("Valanyr obtained!");
                    } else if (material.equals("motes")) {
                        System.out.println("Dragonwrath obtained!");
                    }
                    needed.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
                    for (var entry : junk.entrySet()){
                        System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
                    }
                    break;
                }
            } else if (!junk.containsKey(material)){
                junk.put(material, quantity);
            } else {
                junk.put(material, junk.get(material) + quantity);
            }

            if (input.size() == 0){
                    input = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
            }
        }
    }
}

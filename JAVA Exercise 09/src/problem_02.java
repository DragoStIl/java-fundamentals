import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] racersNames = scan.nextLine().split(",\\s+");
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (String name : racersNames) {
            racers.put(name, 0);
        }

        String input = scan.nextLine();

        while (!input.equals("end of race")){
            StringBuilder currentName = new StringBuilder();
            // name regex -> if name exist
            Pattern name = Pattern.compile("[A-Za-z]+");
            Matcher matcherName = name.matcher(input);
            boolean exist = false;
            while (matcherName.find()){
                currentName.append(matcherName.group());
            }
            if (racers.containsKey(currentName.toString())){
                exist = true;
            }

            // distance regex -> add the distance to the matcherName
            if (exist){
                Pattern patternDistance = Pattern.compile("[0-9]");
                Matcher matcherDistance = patternDistance.matcher(input);
                int distance = 0;
                while (matcherDistance.find()){
                    distance += Integer.parseInt(matcherDistance.group());
                }
                if (exist){
                    int currentDistance = racers.get(currentName.toString());
                    racers.put(currentName.toString(), currentDistance + distance);
                }
            }


            input = scan.nextLine();
        }
        // print the first 3 by descending order
//        Map<String, Integer> winners = racers.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .limit(3)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));

        List<String> threeNames = new ArrayList<>();
        racers.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).forEach(entry -> {
                    threeNames.add(entry.getKey());
        });

        System.out.println("1st place: " + threeNames.get(0));
        System.out.println("2nd place: " + threeNames.get(1));
        System.out.println("3rd place: " + threeNames.get(2));

    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //score Map
        Map<String, Integer> scores = new TreeMap<>();
        //submissions counter Map
        Map<String, Integer> submissions = new TreeMap<>();

        String input = scan.nextLine();
        //{username}-{language}-{points}
        //{username}-banned
        //exam finished
        while(!input.equals("exam finished")){
            String[] separated = input.split("-");

            String user = separated[0];

            if (separated.length == 3){ // add points && submission
                String language = separated[1];
                int points = Integer.parseInt(separated[2]);

                // add points to user;
                if (!scores.containsKey(user)){
                    scores.put(user, points);
                } else if (scores.get(user) < points){
                    scores.put(user, points);
                }

                //add contest to language;
                if (!submissions.containsKey(language)){
                    submissions.put(language, 1);
                } else {
                    submissions.put(language, submissions.get(language) + 1);
                }

            } else { // ban user
                scores.remove(user);
            }


            input = scan.nextLine();
        }
        System.out.println("Results:");
        scores.entrySet().stream().sorted((u1, u2) -> Integer.compare(u2.getValue(), u1.getValue()))
                .forEach(user -> {
                    System.out.println(user.getKey() + " | " + user.getValue());
                });
        System.out.println("Submissions:");
        submissions.entrySet().stream().sorted((l1, l2) -> Integer.compare(l2.getValue(), l1.getValue()))
                .forEach(language -> {
                    System.out.println(language.getKey() + " - " + language.getValue());
                });

    }
}

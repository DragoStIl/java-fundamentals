import java.util.*;

public class problem_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> theForce = new TreeMap<>();


        String input = scan.nextLine();
            while (!input.equals("Lumpawaroo")){

                if (input.contains("|")){  //register to some side
                    String side = input.split(" \\| ")[0];
                    String user = input.split(" \\| ")[1];
                    if (!theForce.containsKey(side)){
                        theForce.put(side, new ArrayList<>());
                    }
                    boolean existing = false;
                    for (List<String> list : theForce.values()){
                        if (list.contains(user)){
                            existing = true;
                        }
                    }
                    if (!existing){
                        theForce.get(side).add(user);
                    }

//                    if (theForce.containsKey(side) && !theForce.get(side).contains(user)){
//                        theForce.get(side).add(user);
//                    }

                } else if (input.contains("->")){ // swap sides
                    String side = input.split(" -> ")[1];
                    String user = input.split(" -> ")[0];
                    theForce.forEach((key, value) -> value.remove(user));

                    theForce.putIfAbsent(side, new ArrayList<>());
                    theForce.get(side).add(user);
                    System.out.println(user + " joins the " + side + " side!");

                }
                input = scan.nextLine();
            }
            theForce.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                    .sorted((m1, m2) -> Integer.compare(m2.getValue().size(), m1.getValue().size()))
                    .forEach(entry -> {
                        System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                        entry.getValue().stream().sorted().forEach(forceUser -> System.out.println("! " + forceUser));
                    });
        }
    }

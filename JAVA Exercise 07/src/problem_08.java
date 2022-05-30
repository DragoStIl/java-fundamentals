import java.util.*;

public class problem_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> employees = new TreeMap<>();

        String input = scan.nextLine();
        while(!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            if (!employees.containsKey(company)){
                employees.put(company, new ArrayList<>());
            }
            if (!employees.get(company).contains(id)){
                employees.get(company).add(id);
            }

            input = scan.nextLine();
        }
        employees.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().stream().forEach(worker -> System.out.println("-- " + worker));
        });
    }
}

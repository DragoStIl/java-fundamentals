import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> parking = new LinkedHashMap<>();

        int operations = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < operations; i++) {
            String[] input = scan.nextLine().split("\\s+");

            if (input[0].equals("register")){
                String user = input[1];
                String id = input[2];
                if (parking.containsKey(user)){
                    System.out.println("ERROR: already registered with plate number " + parking.get(user));
                } else {
                    parking.put(user, id);
                    System.out.println(user + " registered " + id + " successfully");
                }
            } else if (input[0].equals("unregister")){
                String user = input[1];
                if (parking.containsKey(user)){
                    parking.remove(user);
                    System.out.println(user + " unregistered successfully");
                } else {
                    System.out.println("ERROR: user " + user + " not found");
                }
            }
        }
        for (var entry : parking.entrySet()){
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}

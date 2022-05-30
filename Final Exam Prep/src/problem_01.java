import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scan.nextLine());

        String commands = scan.nextLine();
        while (!commands.equals("Travel")){
            String[] split = commands.split(":");
            if (split[0].equals("Add Stop")){
                int index = Integer.parseInt(split[1]);
                if (index < input.length()){
                    String add = split[2];
                    input.insert(index, add);
                    System.out.println(input);
                }
            } else if (split[0].equals("Remove Stop")){
                int start = Integer.parseInt(split[1]);
                int end = Integer.parseInt(split[2]);
                if (start < input.length() && end < input.length()){
                    input.delete(start, end);
                }
                System.out.println(input);

            } else if (split[0].equals("Switch")){
                String switching = input.toString();
                switching = switching.replaceAll(split[1], split[2]);
                input = new StringBuilder(switching);
                System.out.println(input);
                }
            commands = scan.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + input);
        }
    }

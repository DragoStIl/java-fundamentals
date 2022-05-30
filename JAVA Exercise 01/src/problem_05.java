import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //given name
        String name = scan.nextLine();
        String password = scan.nextLine();
        String pass = "";

        // pass is the reverse name
        for (int i = name.length() -1; i >= 0 ; i--) {
            char current = name.charAt(i);
            pass += current;
        }
        // if pass wrong = try again until it is wrong 4 times
        int counter = 0;
        while (!password.equals(pass)){
            counter++;
            if (counter >= 4){
                System.out.printf("User %s blocked!", name);
                return;
            }

            System.out.println("Incorrect password. Try again.");
            password = scan.nextLine();
        }

        //if correct = user "" logged in
        System.out.printf("User %s logged in.", name);

    }
}

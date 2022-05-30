import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);



        // length between 3 and 16
        // contains only letters, digits, "-" and "_";

        String[] userNames = scan.nextLine().split(", ");

        for (String name : userNames){
            boolean valid = true;
            if (name.length() >= 3 && name.length() <= 16){
                for (char current : name.toCharArray()){
                    if (!(Character.isLetterOrDigit(current)) && current != '-' && current != '_'){
                        valid = false;
                        break;
                    }
                }
                if (valid){
                    System.out.println(name);
                }
            }
        }
    }
}

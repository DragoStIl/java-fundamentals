import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());
        gradeWord(grade);
    }

    private static void gradeWord(double word) {
        if (word >= 2 && word <= 2.99){
            System.out.println("Fail");
        } else if (3 <= word && word <= 3.49){
            System.out.println("Poor");
        } else if (3.5 <= word && word <= 4.49){
            System.out.println("Good");
        } else if (4.5 <= word && word <= 5.49){
            System.out.println("Very good");
        } else if (5.5 <= word && word <= 6){
            System.out.println("Excellent");
        }
    }
}

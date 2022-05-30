import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int specialNum = Integer.parseInt(scan.nextLine());
        printSign(specialNum);
    }

    public static void printSign(int number){
        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        } else if (number == 0){
            System.out.printf("The number %d is zero.", number);
        } else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        }
    }
}

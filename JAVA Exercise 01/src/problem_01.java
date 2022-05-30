import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //0-2 baby
        //3-13 child
        //14-19 teenager
        //20-65 adult
        //>65 elder
        int age = Integer.parseInt(scan.nextLine());

        if (0 <= age && age <= 2){
            System.out.println("baby");
        } else if (3 <= age && age <= 13){
            System.out.println("child");
        } else if (14 <= age && age <= 19){
            System.out.println("teenager");
        } else if ( 20 <= age && age <= 65){
            System.out.println("adult");
        } else if (age >= 66){
            System.out.println("elder");
        }
    }
}

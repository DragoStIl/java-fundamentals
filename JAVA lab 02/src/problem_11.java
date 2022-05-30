import java.util.Scanner;

public class problem_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double sum = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", sum);

    }
}

import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kegNumbers = Integer.parseInt(scan.nextLine());
        double biggestKegVolume = Double.MIN_VALUE;
        String biggestKegName = "";

        for (int i = 1; i <= kegNumbers; i++) {
            String kegModel = scan.nextLine();
            double kegRadius = Double.parseDouble(scan.nextLine());
            int kegHeight = Integer.parseInt(scan.nextLine());
            double kegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;
            if (kegVolume > biggestKegVolume){
                biggestKegVolume = kegVolume;
                biggestKegName = kegModel;
            }
        }
        System.out.println(biggestKegName);
    }
}

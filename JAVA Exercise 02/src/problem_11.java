import java.util.Scanner;

public class problem_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double max = Double.MIN_VALUE;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        double value = 0;
        for (int i = 1; i <= n; i++) {
            int snow = Integer.parseInt(scan.nextLine());
            int time = Integer.parseInt(scan.nextLine());
            int quality = Integer.parseInt(scan.nextLine());
            value = Math.pow((snow * 1.0 / time), quality);
            if (max < value){
                max = value;
                snowballSnow = snow;
                snowballTime = time;
                snowballQuality = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnow,
                snowballTime, max, snowballQuality);
    }
}

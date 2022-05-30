import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // every second lost = headset
        // every third = mouse
        // every sixth = mouse + headset + keyboard
        // every twelve = mouse + headset + keyboard + monitor

        int looses = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double monitorPrice = Double.parseDouble(scan.nextLine());

        int brokenHeadset = looses / 2;
        int brokenMice = looses / 3;
        int brokenKeyboard = looses / 6;
        int brokenMonitors = looses / 12;

        double sumHeadset = brokenHeadset * headsetPrice;
        double sumMice = brokenMice * mousePrice;
        double sumKeyboard = brokenKeyboard * keyboardPrice;
        double sumMonitors = brokenMonitors * monitorPrice;

        double total = sumHeadset + sumMice + sumKeyboard + sumMonitors;
        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}

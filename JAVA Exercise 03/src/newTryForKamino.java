import java.util.Arrays;
import java.util.Scanner;

public class newTryForKamino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        int bestCounter = 0;
        int bestPosition = 0;
        int bestSum = 0;

        int bestSample = 0;

        int sample = 0; // за да броя масивите;

        while (!command.equals("Clone them!")){

            int sum = 0; // сумирам за всеки низ за да разбера колко единици има;
            int position = 0;
            sample++;

            int[] cloneDNA = Arrays.stream(command.split("!"))
                    .mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < cloneDNA.length; i++) {

                int counter = 0;


                if (cloneDNA[i] == 1 && i > 0){

                    for (int j = 0; j < i; j++) {
                        if (j == 1){
                            counter++;
                            sum += cloneDNA[j];
                        } else {
                            counter = 0;
                        }
                    }
                }
                if (counter > bestCounter){
                    bestCounter = counter;
                    bestSample = sample;
                } else {
//                    if (){
//
//                    } else {
//
//                    }
                }


            }

            command = scan.next();
        }
    }
}

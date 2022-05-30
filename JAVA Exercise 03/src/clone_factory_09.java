import java.util.Arrays;
import java.util.Scanner;

public class clone_factory_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // НАЙ-ДЪЛГАТА ПОСЛЕДОВАНТЕЛНОСТ
        // АКО СА ЕДНАКВИ ПОСЛЕДОВАТЕЛНОСТИТЕ -> ТОЗИ КОЙТО ЗАПОЧВА В ПО-МАЛЪК ИНДЕКС
        // АКО ИНДЕКСИТЕ НА ЗАПОЧВАНЕ СА ЕДНАКВИ -> НИЗЪТ С НАЙ-ГОЛЯМА СУМА

        int arrayLength = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        int[] sampleDNA = new int[arrayLength];

//        boolean shortArray = false;
//        // проверявам дали масива не е само от 2 елемента
//        if (arrayLength <= 2){
//            shortArray = true;
//        }

        // запазвам най добрите резултати
        int bestSequence = 0;
        int bestIndex = Integer.MIN_VALUE;
        int bestSum = 0;
        int[] bestDNA = new int[arrayLength];
        int bestSample = 0;

        // броя низовете
        int sampleCount = 0;

        // въртя до команда "Clone them!"
        while (!command.equals("Clone them!")){
            sampleCount++;


            // правя 3 флага за да не объркам
            boolean isLonger = false;
            boolean isEarlier = false;
            boolean isBigger = false;

            command = command.replaceAll("!+", " ");
            // превръщам входа в int[]
            sampleDNA = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            int zeroSum = 0;
            int sampleSum = 0;
            int sequenceCounter = 1;
            int starterIndex = 0;


            //проверявам дали масива не е само от нули. Ако е прочитам отново и завъртам
            for (int i : sampleDNA) {
                zeroSum += i;
            }
            if (zeroSum == 0){
                command = scan.nextLine();
                continue;
            }

            for (int i : sampleDNA) {
                sampleSum += i;
            }
            // търся последователност
            for (int j = 0; j < sampleDNA.length - 1; j++) {
                if (sampleDNA[j] == sampleDNA[j + 1] && sampleDNA[j] == 1){ // ако намеря последователност
                    sequenceCounter++; // броя колко е дълга тя
                    // запазвам индекса на последователност
                    // (променя се но го пренебрегвам защото ако намеря масив с по ранен стартов индекс резултатът ще е удовлетворителен)
                    starterIndex = j;
                }
            }
            // сравнявам дали текущите резултати са по добри от запазените до момента
            if (bestSequence == sequenceCounter){ // ако дължината на съвпадения е еднаква правя проверка за ранен индекс

                if (bestIndex == starterIndex){ // ако стартовия индекс е еднакъв, правя проверка за по-голяма сума

                    if (bestSum < sampleSum){ // ако сумата на текущия низ е по-голяма -> запазвам
                        bestSum = sampleSum;
                        bestSequence = sequenceCounter;
                        bestIndex = starterIndex;
                        isBigger = true;
                        bestSample = sampleCount;

                    }
                } else if (bestIndex > starterIndex){ // ако текущия индекс е по ранен -> запазвам
                    bestIndex = starterIndex;
                    bestSequence = sequenceCounter;
                    bestSum = sampleSum;
                    isEarlier = true;
                    bestSample = sampleCount;
                }
            } else if (bestSequence < sequenceCounter) { // ако текущата последователност е по-голяма -> запазвам
                bestSequence = sequenceCounter;
                bestIndex = starterIndex;
                bestSum = sampleSum;
                isLonger = true;
                bestSample = sampleCount;

            }

            // отново проверявам, за да запазя низа който отговаря най добре на условието;
            if (isLonger){
                for (int i = 0; i < sampleDNA.length; i++) {
                    bestDNA[i] = sampleDNA[i];
                }

            }
            if (isEarlier){
                for (int i = 0; i < sampleDNA.length; i++) {
                    bestDNA[i] = sampleDNA[i];
                }
            }
            if (isBigger){
                for (int i = 0; i < sampleDNA.length; i++) {
                    bestDNA[i] = sampleDNA[i];
                }
            }
            command = scan.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, bestSum);
        for (int i : bestDNA) {
            System.out.print(i + " ");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class problem_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] mainArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] copyOfMainArray = mainArray;

        String input = scan.nextLine();
        while (!input.equals("end")){

            // exchange {index}
            // max even/odd
            // min even/odd

            // first {count} even/odd
            // last {count} even/odd

            String[] commands = input.split(" ");
            String keyword = commands[0];

            switch (keyword){
                case("exchange"):
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index < mainArray.length){
                        copyOfMainArray = exchanger(mainArray, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case("max"):
                    String maxType = commands[1];
                    if (maxType.equals("even")){
                        maxEvenChecker(mainArray);
                    } else if (maxType.equals("odd")){
                        maxOddChecker(mainArray);
                    }
                    break;
                case("min"):
                    String minType = commands[1];
                    if (minType.equals("even")){
                        minEvenChecker(mainArray);
                    } else if (minType.equals("odd")){
                        minOddChecker(mainArray);
                    }
                    break;
                case("first"):
                    int countFirst = Integer.parseInt(commands[1]);
                    String typeOfFirstSearch = commands[2];
                    if (0 < countFirst && countFirst <= mainArray.length) {
                        if (typeOfFirstSearch.equals("even")) {
                            firstEvenPrinter(mainArray, countFirst);
                        } else if (typeOfFirstSearch.equals("odd")){
                            firstOddPrinter(mainArray, countFirst);
                        }
                    } else {
                        System.out.println("Invalid count");
                    }
                    break;
                case("last"):
                    int countLast = Integer.parseInt(commands[1]);
                    String typeOfLastSearch = commands[2];
                    if (0 < countLast && countLast <= mainArray.length) {
                        if (typeOfLastSearch.equals("even")){
                            lastEvenPrinter(mainArray, countLast);
                        } else if (typeOfLastSearch.equals("odd")){
                            lastOddPrinter(mainArray, countLast);
                        }
                    } else {
                        System.out.println("Invalid count");
                    }
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println(Arrays.toString(copyOfMainArray));
    }


    private static int[] exchanger(int[] workingArray, int stopIndex) {
        int[] firstHalf = new int[stopIndex + 1];
        int[] secondHalf = new int[workingArray.length - firstHalf.length];

        // записвам в първия масив числата до дадения индекс
        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = workingArray[i];
        }
        // записвам във втория масив след дадения индекс до края
        //int second = secondHalf.length - 1;
        for (int i = 0; i < secondHalf.length; i++) {
            //int index = workingArray[i];
            secondHalf[i] = workingArray[i + stopIndex + 1];
        }

        // презаписвам основния с разменените стойности
        for (int i = 0; i < secondHalf.length; i++) {
            workingArray[i] = secondHalf[i];
        }
        int firstHalfLength = firstHalf.length - 1;
        for (int i = secondHalf.length; i < workingArray.length; i++) {
            workingArray[i] = firstHalf[i - secondHalf.length];
            firstHalfLength--;
        }
        //System.out.println(Arrays.toString(workingArray));
        return workingArray;
    }

    private static void maxEvenChecker(int[] workArray) {
        int max = Integer.MIN_VALUE;
        boolean foundIt = false;
        int indexOfMax = 0;
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i] % 2 == 0){
                foundIt = true;
                if (workArray[i] >= max){
                    max = workArray[i];
                    indexOfMax = i;
                }
            }
        }
        if (foundIt){
            System.out.println(indexOfMax);
        } else {
            System.out.println("No matches");
        }
    }

    private static void maxOddChecker(int[] workArray){
        int max = Integer.MIN_VALUE;
        boolean foindIt = false;
        int indexOfMax = 0;
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i] % 2 == 1){
                foindIt = true;
                if (workArray[i] >= max){
                    max = workArray[i];
                    indexOfMax = i;
                }
            }
        }
        if (foindIt){
            System.out.println(indexOfMax);
        } else {
            System.out.println("No matches");
        }
    }

    private static void minEvenChecker(int[] workArray){
        int max = Integer.MAX_VALUE;
        boolean foundIt = false;
        int indexOfMin = 0;
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i] % 2 == 0){
                foundIt = true;
                if (workArray[i] <= max){
                    max = workArray[i];
                    indexOfMin = i;
                }
            }
        }
        if (foundIt){
            System.out.println(indexOfMin);
        } else {
            System.out.println("No matches");
        }
    }

    private static void minOddChecker(int[] workArray){
        int max = Integer.MAX_VALUE;
        boolean foundIt = false;
        int indexOfMin = 0;
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i] % 2 == 1){
                foundIt = true;
                if (workArray[i] <= max){
                    max = workArray[i];
                    indexOfMin = i;
                }
            }
        }
        if (foundIt){
            System.out.println(indexOfMin);
        } else {
            System.out.println("No matches");
        }
    }

    private static void firstEvenPrinter(int[] mainArray, int workArrayRange){
        int[] workArray = new int[workArrayRange];
        int evenCounter = 0;
        String needed = "";
        for (int number : mainArray) {
            if (number % 2 == 0 && evenCounter < workArrayRange){
                needed += (number + " ");
                evenCounter++;
            }
        }
        String[] output = needed.split(" ");
        System.out.println(Arrays.toString(output));
    }

    private static void firstOddPrinter(int[] mainArray, int workArrayRange){
        int[] workArray = new int[workArrayRange];
        int evenCounter = 0;
        String needed = "";
        for (int number : mainArray) {
            if (number % 2 == 1 && evenCounter < workArrayRange){
                needed += (number + " ");
                evenCounter++;
            }
        }
        String[] output = needed.split(" ");
        System.out.println(Arrays.toString(output));
    }

    private static void lastEvenPrinter(int[] mainArray, int workArrayRange){
        int[] workArray = new int[workArrayRange];
        int evenCounter = 0;
        String needed = "";
        for (int i = mainArray.length - 1; i >= 0; i--) {
            if (mainArray[i] % 2 == 0 && evenCounter < workArrayRange){
                needed += (mainArray[i] + " ");
                evenCounter++;
            }
        }
        String[] reverse = needed.split(" ");
        String[] output = new String[reverse.length];
        int indexesOfOutput = reverse.length;
        for (int j = 0; j < reverse.length; j++) {
            output[indexesOfOutput - 1] = reverse[j];
            indexesOfOutput--;
        }
        System.out.println(Arrays.toString(output));
    }

    private static void lastOddPrinter(int[] mainArray, int workArrayRange){
        int[] workArray = new int[workArrayRange];
        int evenCounter = 0;
        String needed = "";
        for (int i = mainArray.length - 1; i >= 0; i--) {
            if (mainArray[i] % 2 == 1 && evenCounter < workArrayRange){
                needed += (mainArray[i] + " ");
                evenCounter++;
            }
        }
        String[] reverse = needed.split(" ");
        String[] output = new String[reverse.length];
        int indexesOfOutput = reverse.length;
        for (int j = 0; j < reverse.length; j++) {
            output[indexesOfOutput - 1] = reverse[j];
            indexesOfOutput--;
        }
        System.out.println(Arrays.toString(output));
    }
}

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wordToRemove = scan.nextLine();
        String sequence = scan.nextLine();

        while (sequence.contains(wordToRemove)){

            int beginIndex = sequence.indexOf(wordToRemove);
            int lastIndex = wordToRemove.length() + beginIndex;

            String first = (sequence.substring(0, beginIndex)) + (sequence.substring(lastIndex));
//            first = sequence.substring(0,beginIndex);
//            String last = sequence.substring(lastIndex);

            sequence = first;
        }
        System.out.println(sequence);
    }
}

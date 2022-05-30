import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         List<String> words = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] command = scan.nextLine().split("\\s+");

        while (!command[0].equals("3:1")){

            if (command[0].equals("merge")){
                StringBuilder merged = new StringBuilder();
                int start = Integer.parseInt(command[1]);
                int end = Integer.parseInt(command[2]);
                if (start < 0){
                    start = 0;
                }
                if (end > words.size() - 1){
                    end = words.size() - 1;
                }

                if (start >= 0 && start < words.size() && end >= 0 && end < words.size()){
                    for (int i = start; i <= end; i++) {
                        merged.append(words.get(i));
                    }
                    for (int i = start; i <= end; i++) {
                        words.remove(start);
                    }
                    words.add(start, merged.toString());
                }
            }else if (command[0].equals("divide")){
                int index = Integer.parseInt(command[1]);
                int divider = Integer.parseInt(command[2]);
                String indexWord = words.get(index);
                int partSize = indexWord.length() / divider;
                int begin = 0;

                words.remove(index);
                for (int i = 1; i < divider; i++) {
                    words.add(index, indexWord.substring(begin, begin + partSize));
                    index++;
                    begin+=partSize;
                }
                words.add(index,indexWord.substring(begin));
            }
            command = scan.nextLine().split("\\s+");
        }
        System.out.println(String.join(" ", words));
    }
}

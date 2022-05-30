import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] justArray = {};
        String empty = "";
        for (int i : justArray) {
            if (i != 0){
                empty +=(i + " ");
            }
        }
        //System.out.print("[");
        String[] print = empty.split(" ");
        System.out.println(Arrays.toString(print));

        //System.out.println(java.util.Arrays.toString(empty.split("\\|")));

    }
}

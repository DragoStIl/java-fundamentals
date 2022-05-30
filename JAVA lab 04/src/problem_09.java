import java.util.Scanner;

public class problem_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String varType = scan.nextLine();
        String first = scan.nextLine();
        String second = scan.nextLine();

        if (varType.equals("int")){
            int biggestInt = returnMaxInteger(first, second);
            System.out.println(biggestInt);
        } else if (varType.equals("string")){
            String biggestString = returnMaxString(first, second);
            System.out.println(biggestString);
        } else if (varType.equals("char")){
            char biggestChar = returnMaxChar(first, second);
            System.out.println(biggestChar);
        }
    }



    private static int returnMaxInteger(String firstString, String secondString) {
        int firstInt = Integer.parseInt(firstString);
        int secondInt = Integer.parseInt(secondString);
        return Math.max(firstInt, secondInt);


    }

    private static String returnMaxString(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0){
            return firstString;
        } else {
            return secondString;
        }
    }

    private static char returnMaxChar(String firstString, String secondString) {
        char firstChar = firstString.charAt(0);
        char secondChar = secondString.charAt(0);
        if (firstChar > secondChar){
            return firstChar;
        } else {
            return secondChar;
        }
    }

}

import java.util.*;

public class problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int prints = Integer.parseInt(scan.nextLine());

        Random rnd = new Random();

        List<String> firstWord = Arrays.asList("Excellent product., Such a great product., I always use that product., Best product of its category., Exceptional product., I can’t live without this product.".split(", "));

        List<String> secondWord = Arrays.asList("Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!");

        List<String> thirdWord = Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya",
                "Iva", "Annie", "Eva");


        List<String> forthWord = Arrays.asList("Burgas Sofia Plovdiv Varna Ruse".split("\\s+"));



        for (int i = 0; i < prints; i++) {
            String first = firstWord.get(rnd.nextInt(firstWord.size()));
            String second = secondWord.get(rnd.nextInt(secondWord.size()));
            String third = thirdWord.get(rnd.nextInt(thirdWord.size()));
            String forth = forthWord.get(rnd.nextInt(forthWord.size()));
            System.out.println(first + " " + second + " " + third + " - " + forth);
        }


    }
}

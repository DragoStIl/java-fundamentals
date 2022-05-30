package problem_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scan.nextLine());


        List<Article> library = new ArrayList<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String[] article = scan.nextLine().split(",\\s+");
            Article main = new Article(article[0], article[1], article[2]);
            library.add(main);
        }
        String sorter = scan.nextLine();
        if (sorter.equals("title")){
            library.sort(Comparator.comparing(Article::getTitle));
        } else if (sorter.equals("content")){
            library.sort(Comparator.comparing(Article::getContent));
        } else if (sorter.equals("author")){
            library.sort(Comparator.comparing(Article::getAuthor));
        }

        for (Article article : library) {
            System.out.println(article);
        }

    }
}

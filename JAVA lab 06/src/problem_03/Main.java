package problem_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Song> playlist = new ArrayList<>();

        int songsNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < songsNumber; i++) {
            String[] songData = scan.nextLine().split("_");
            Song current = new Song(songData[0], songData[1], songData[2]);
            playlist.add(current);
        }

        String type = scan.nextLine();

        if (type.equals("all")){
            for (Song song : playlist) {
                System.out.println(song);
            }
        } else {
            for (Song song : playlist) {
                if (song.getTypeList().equals(type)){
                    System.out.println(song);
                }
            }
        }

    }
}

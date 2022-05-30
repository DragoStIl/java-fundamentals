package problem_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Student> group = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] stud = scan.nextLine().split("\\s+");
            Student newStud = new Student(stud[0], stud[1], Double.parseDouble(stud[2]));
            group.add(newStud);
        }

        group.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(group);
        for (Student student : group) {
            System.out.println(student);
        }

    }
}

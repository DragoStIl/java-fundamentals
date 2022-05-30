import java.util.*;

public class problem_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Double> grades = new LinkedHashMap<>();
        Map<String, Integer> counter = new HashMap<>();

        int rotations = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < rotations; i++) {
            String student = scan.nextLine();
            Double newGrade = Double.parseDouble(scan.nextLine());
            if (!grades.containsKey(student)){
                grades.put(student, newGrade);
                counter.put(student, 1);
            } else {
                grades.put(student, grades.get(student) + newGrade);
                counter.put(student, counter.get(student) + 1);

            }
        }
        for (var entry : grades.entrySet()){
            String student = entry.getKey();
            double average = entry.getValue() / counter.get(student);
            grades.put(student, average);
        }
        grades.entrySet().stream().filter(e -> e.getValue() >= 4.5)
                .sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .forEach(entry -> {
                    System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
                });

    }
}

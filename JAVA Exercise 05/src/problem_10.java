import com.sun.source.tree.IfTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> courses = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("course start")) {
            String[] tokens = command.split(":");

            boolean existingLesson1 = false;
            int positionOfLesson1 = 0;

            for (int i = 0; i < courses.size(); i++) { // проверявам дали има дадения урок и ако да запазвам позицията
                if (courses.get(i).equals(tokens[1])) {
                    existingLesson1 = true;
                    positionOfLesson1 = i;
                    break;
                }
            }

            String firstExerciseName = tokens[1] + "-" + "Exercise";
            boolean existingExercise1 = false;
            int positionOfExercise1 = 0;

            if (existingLesson1) { // преоверявам дали към урока има упражнение и ако да запазвам позицията
                for (int i = 0; i < courses.size(); i++) {
                    if (courses.get(i).equals(firstExerciseName)) {
                        existingExercise1 = true;
                        positionOfExercise1 = i;
                        break;
                    }
                }
            }

            switch (tokens[0]) {
                case ("Add"):
                    if (!existingLesson1) {
                        courses.add(tokens[1]);
                    }
                    break;
                case ("Insert"):
                    int index = Integer.parseInt(tokens[2]);
                    if (0 <= index && index < courses.size() && !existingLesson1) {
                        courses.add(index, tokens[1]);
                    }
                    break;
                case ("Remove"):
                    if (existingLesson1) {
                        courses.remove(tokens[1]);
                        if (existingExercise1) {
                            courses.remove(firstExerciseName);
                        }
                    }
                    break;
                case ("Swap"):
                    boolean existingLesson2 = false;
                    int positionOfLesson2 = 0;

                    for (int i = 0; i < courses.size(); i++) { // проверявам дали има втори урок и ако да, го запазвам
                        if (courses.get(i).equals(tokens[2])) {
                            existingLesson2 = true;
                            positionOfLesson2 = i;
                            break;
                        }
                    }

                    String secondExerciseName = tokens[2] + "-" + "Exercise";
                    boolean existingExercise2 = false;
                    int positionOfExercise2 = 0;

                    if (existingLesson2) {
                        for (int i = 0; i < courses.size(); i++) {
                            if (courses.get(i).equals(secondExerciseName)) {
                                existingExercise2 = true;
                                positionOfExercise2 = i;
                                break;
                            }
                        }
                    }
                    if (existingLesson1 && existingLesson2) {
                        Collections.swap(courses, positionOfLesson1, positionOfLesson2);
                    }
                    if (existingExercise1 && existingExercise2) {
                        Collections.swap(courses, positionOfExercise1, positionOfExercise2);
                    } else if (existingExercise1 && !existingExercise2) {
                        if (positionOfLesson2 < courses.size() - 1) {
                            courses.remove(firstExerciseName);
                            courses.add(positionOfLesson2 + 1, firstExerciseName);
                        } else {
                            courses.add(firstExerciseName);
                        }
                        courses.remove(positionOfExercise1);
                    } else if (!existingExercise1 && existingExercise2) {
                        if (positionOfLesson1 < courses.size() - 1) {
                            courses.remove(secondExerciseName);
                            courses.add(positionOfLesson1 + 1, secondExerciseName);
                        } else {
                            courses.add(secondExerciseName);
                        }
                    }
                    break;
                case ("Exercise"):
                    if (existingLesson1 && !existingExercise1) {
                        exerciseOFLesson(courses, tokens[1], firstExerciseName);
                    } else if (!existingLesson1) {
                        courses.add(tokens[1]);
                        courses.add(firstExerciseName);
                    }
                    break;
            }


            command = scan.nextLine();
        }
        int number = 1;
        for (String lesson : courses) {
            System.out.println(number + "." + lesson);
            number++;
        }
    }


    private static void exerciseOFLesson(List<String> courses, String token, String exerciseName) {

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals(token)){
                if (i < courses.size() - 1){
                    courses.add(i + 1, exerciseName);
                } else {
                    courses.add(exerciseName);
                }
            }
        }
    }
}

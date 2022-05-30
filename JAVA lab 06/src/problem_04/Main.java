package problem_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] student = scan.nextLine().split("\\s+");
        List<Students> registry = new ArrayList<>();

        while (!student[0].equals("end")){
            boolean existStudent = false;

            String firstName = student[0];
            String lastName = student[1];
            String age = student[2];
            String city = student[3];

            for (Students students : registry) {
                if (students.getFirstName().equals(firstName) && students.getLastName().equals(lastName)){
                    existStudent = true;
                    students.setAge(age);
                    students.setCity(city);
                }
            }
            if (!existStudent){
                Students newOne = new Students(firstName, lastName, age, city);
                registry.add(newOne);
            }


            student = scan.nextLine().split("\\s+");
        }

        String studsFromCity = scan.nextLine();

        for (Students stud : registry) {
            if (stud.getCity().equals(studsFromCity)){
                System.out.println(stud);
            }
        }
    }
}

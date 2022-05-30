package problem_03;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] data = scan.nextLine().split("\\s+");
            Person newPerson = new Person(data[0], Integer.parseInt(data[1]));
            if (newPerson.getAge() > 30){
                people.add(newPerson);
            }
        }

       // people.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        people.sort(Comparator.comparing(Person::getName));
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

    }
}

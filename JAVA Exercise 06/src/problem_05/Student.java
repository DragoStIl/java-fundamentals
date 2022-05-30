package problem_05;

public class Student {

    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String secondName, double grade){
        this.firstName = firstName;
        this.lastName = secondName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", firstName, lastName, grade);
    }
}

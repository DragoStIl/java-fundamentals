package problem_04;

public class Students {

    private String firstName;
    private String lastName;
    private String age;
    private String city;

    public Students(String firstName, String lastName, String age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }









    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }





    @Override
    public String toString() {
        return String.format("%s %s is %s years old", firstName, lastName, age);
    }

}

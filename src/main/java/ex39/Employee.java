package ex39;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String sepDate;

    public Employee(String firstName, String lastName, String position, String sepDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.sepDate = sepDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getSepDate() {
        return sepDate;
    }

    public String getName(){
        return String.format("%s %s", getFirstName(), getLastName());
    }

}

package databaseConnection;

public class Students {
    private int id;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String grade;

    public Students(int id, String firstName, String lastName, String contactNumber, String grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getGrade() {
        return grade;
    }
}
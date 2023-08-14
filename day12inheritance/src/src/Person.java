package src;

public class Person {
    private String firstName;
    private String lastName;
    private int idNumber;

    public Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println("Name: ".concat(this.lastName).concat(", ").concat(this.firstName));
        System.out.println("ID: ".concat(String.valueOf(idNumber)));
    }
}

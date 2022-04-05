public class Person {
    protected String firstName;
    protected String lastName;
    protected String nationalCode;
    private int a;

    public Person(String firstName, String lastName, String nationalCode, int a) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.a = a;
    }

    protected Person(String firstName, String lastName, String nationalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
    }

    public Person() {
    }
}

package model;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String nationalCode;
    protected double money;
    public final static double INITIAL_MONEY = 100;

    protected Person(String firstName, String lastName, String nationalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.money = INITIAL_MONEY;
    }

    public String getType() {
        return "Person";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }
}

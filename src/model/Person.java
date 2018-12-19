package model;

public class Person {
    private Holiday celebrate;

    //EFFECTS: constructs a person without a holiday
    public Person() {}

    //EFFECTS: constructs a person with the holiday they celebrate
    public Person (Holiday holiday) {
        celebrate = holiday;
    }

    //EFFECTS: returns holiday that person celebrates
    public Holiday getCelebrate() {
        return celebrate;
    }
}

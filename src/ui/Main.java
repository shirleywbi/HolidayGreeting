package ui;

import model.Holiday;
import model.HolidayGreetings;
import model.Person;

public class Main {
    public static void main(String[] args) {
        HolidayGreetings greetings = new HolidayGreetings();
        Person p1 = new Person(Holiday.CHRISTMAS);
        Person p2 = new Person(Holiday.HANUKAAH);
        Person p3 = new Person(Holiday.KWANZAA);
        Person p4 = new Person();
        greetings.wishHappyHolidays(p1);
        greetings.wishHappyHolidays(p2);
        greetings.wishHappyHolidays(p3);
        greetings.wishHappyHolidays(p4);

    }
}

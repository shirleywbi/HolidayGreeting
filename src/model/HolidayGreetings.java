package model;

public class HolidayGreetings {

    //EFFECTS: prints holiday greetings based on what person celebrates:
    // Christmas, Hanukaah, Kwanzaa or other
    public void wishHappyHolidays(Person p) {
        if (p.getCelebrate() == Holiday.CHRISTMAS) {
            System.out.println("Merry Christmas!");
        } else if (p.getCelebrate() == Holiday.HANUKAAH) {
            System.out.println("Happy Hanukkah!");
        } else if (p.getCelebrate() == Holiday.KWANZAA) {
            System.out.println("Joyous Kwanzaa!");
        } else {
            System.out.println("Happy Holidays!");
        }
    }

}

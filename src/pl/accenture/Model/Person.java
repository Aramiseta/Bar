package pl.accenture.Model;

import java.util.function.Predicate;

public class Person {
    private int age;
    private boolean isDriver;
    private boolean isPregnant;

    public Predicate<Person> canDrink = p -> !p.isDriver && !p.isPregnant && p.age>18;

    public Person(int age, boolean isDriver, boolean isPregnant) {
        this.age = age;
        this.isDriver = isDriver;
        this.isPregnant = isPregnant;
    }

    public int getAge() {
        return age;
    }

    public boolean isDriver() {
        return isDriver;
    }

    public boolean isPregnant() {
        return isPregnant;
    }
}

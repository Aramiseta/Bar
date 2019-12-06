package pl.accenture;

import pl.accenture.Model.Person;

public class Bar {

    public static void main(String[] args) {
        Person nieletni = new Person(10, false, false);
        Person ciezarna = new Person(20, false, true);
        Person kierowca = new Person(40, true, false);
        Person student = new Person(20, false, false);
        serveDrink(nieletni);
        serveDrink(ciezarna);
        serveDrink(kierowca);
        serveDrink(student);
    }

    static void serveDrink(Person p){
        if(p.canDrink.test(p)){
            System.out.println("Możesz pić!");
        }else{
            System.out.println("Dzisiaj nie pijesz :(");
        }
    }
}

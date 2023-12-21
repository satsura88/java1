import java.time.LocalDate;
import java.util.ArrayList;

import Classes.*;

public class Programm{
    public static void main(String[] args){

        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        Cat cat = new Cat("Barsik", LocalDate.of(1993,6,6),
                             new ArrayList<>(), "Chumka", "Boss", 4);
        Eagle eagle = new Eagle("Orlusha", LocalDate.of(1999,3,6),
                             new ArrayList<>(), "Polyomavirus", "Dagget");
        Beaver beaver = new Beaver("Badass", LocalDate.of(2000,6,23),
                             new ArrayList<>(), "Chumka", "Norbert");
        Duck duck = new Duck("Adolf", LocalDate.of(2016,5,12),
                             new ArrayList<>(), "Polyomavirus", "Boss");


        animals.add(cat);
        animals.add(eagle);
        animals.add(beaver);
        animals.add(duck);
        System.out.println(cat);
        cat.lifeCycle();
        System.out.println(animals);
        for(var entry : animals){
            
        }
        cat.lifeCycle();
        eagle.lifeCycle();
        beaver.lifeCycle();
        duck.lifeCycle();

    }
}
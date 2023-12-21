import java.time.LocalDate;
import java.util.List;

public class Beaver extends Animal{

    public Beaver(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
        //TODO Auto-generated constructor stub
    }
    @Override
    protected void wakeup() {
        System.out.println("Beaver wakes up");
    }
    @Override
    protected void eat() {
        System.out.println("Beaver ate");
    }
    @Override
    protected void sleep() {
        System.out.println("Beaver slepping");
    }
    @Override
    protected void go() {
        System.out.println("Beaver walking");
    }
    @Override
    protected void swim() {
        System.out.println("Beaver swimming");
    }
    @Override
    public void lifeCycle() {
        wakeup();
        eat();
        sleep();
        wakeup();
        go();
        swim();
        sleep();
    }
}
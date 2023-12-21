import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{

    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
        //TODO Auto-generated constructor stub
    }
    @Override
    protected void wakeup() {
        System.out.println("Duck wakes up");
    }
    @Override
    protected void eat() {
        System.out.println("Duck ate");
    }
    @Override
    protected void play() {
        System.out.println("Duck playing");
    }
    @Override
    protected void sleep() {
        System.out.println("Duck sleeping");
    }
    @Override
    protected void go() {
        System.out.println("Duck walking");
    }
    @Override
    protected void fly() {
        System.out.println("Duck flying");
    }
    @Override
    protected void swim() {
        System.out.println("Duck swimming");
    }
    @Override
    public void lifeCycle() {
        wakeup();
        eat();
        play();
        sleep();
        wakeup();
        go();
        fly();
        eat();
        swim();
        sleep();
    }
    
}
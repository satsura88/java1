import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{

    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
        //TODO Auto-generated constructor stub
    }
    @Override
    protected void wakeup() {
        System.out.println("Eagle wakes up");
    }
    @Override
    protected void go() {
        System.out.println("Eagle walks");
    }
    @Override
    protected void fly() {
        System.out.println("Eagle flying");
    }
    @Override
    protected void eat() {
        System.out.println("Eagle ate");
    }
    @Override
    protected void sleep() {
        System.out.println("Eagle sleeping");
    }
    @Override
    public void lifeCycle() {
        wakeup();
        go();
        fly();
        eat();
        sleep();
    }
}
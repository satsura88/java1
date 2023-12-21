import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {

    private int legsCount;
    public Cat(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount=legsCount;
        //TODO Auto-generated constructor stub
    }
    @Override
    protected void wakeup() {
        System.out.println("Cat wakes up");
    }
    @Override
    protected void eat() {
        System.out.println("Cat ate");
    }
    @Override
    protected void play() {
        System.out.println("Cat playing");
    }
    @Override
    protected void sleep() {
        System.out.println("Cat sleeping");
    }
    @Override
    protected void go() {
        System.out.println("Cat walking");
    }

    @Override
    public void lifeCycle() {
        wakeup();
        eat();
        play();
        sleep();
        wakeup();
        go();
        sleep();
    }
    
}
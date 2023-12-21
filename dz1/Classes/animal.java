import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;
    
    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner){
        this.name=name;
        this.birthDate=birthDate;
        this.vaccinations=vaccinations;
        this.illness=illness;
        this.owner=owner;
    }
    public String getName(){
        return name;
    }
    public LocalDate getBirthDate(){
        return birthDate;
    }
    public List<String> getVaccinations(){
        return vaccinations;
    }
    public String getIllness(){
        return illness;
    }
    public String getOwner(){
        return owner;
    } 

    protected void eat(){
        System.out.println("Animal ate");
    }
    protected void sleep(){
        System.out.println("Animal sleeping");
    }
    protected void play(){
        System.out.println("Animal playing");
    }
    protected void go(){
        System.out.println("Animal walking");
    }
    protected void fly(){
        System.out.println("Animal flying");
    }
    protected void swim(){
        System.out.println("Animal swimming");
    }

    protected void wakeup(){
        System.out.println("Animal wakes up");
    }
    protected void wakeup(LocalDate time){
        System.out.println(String.format("Animal had woken up in %s", time));
    }
    protected void lifeCycle(){
        wakeup();
        eat();
        play();
        sleep();
        wakeup();
        go();
        fly();
        swim();
        sleep();
    }

    @Override
    public String toString(){

        return "Animal{"+ "name='"+name+'\''+
        ", birthdate='"+birthDate+'\''+
        ", vaccinations='"+vaccinations+'\''+
        ", illness='"+illness+'\''+
        ", owner='"+owner+'\''+
        '}';
    }
}
import java.util.Date;

public class Human {
    String lastname;
    String name;
    String surname;
    String date;
    String telephone;
    String gender;

    public Human(String lastname, String name, String surname, String date, String telephone, String gender) {
        this.lastname = lastname;
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.telephone = telephone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", lastname, name, surname, date, telephone, gender);
    }
}

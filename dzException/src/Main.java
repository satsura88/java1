import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел: Фамилия Имя Отчество дата_рождения(ДД.ММ.ГГГГ) номер_телефона пол(m/f)");
        String next = scanner.nextLine();
        if(next.isEmpty()){
            System.out.println("Повторите попытку!");
            return;
        }

        String[] split = next.split(" ");
        if(split.length != 6) {
            System.out.println("Неверное количество данных в строке");
            return;
        }
        String lastname = split[0];
        String name = split[1];
        String surname = split[2];
        String date = split[3];
        String telephone = split[4];
        String gender = split[5];

        if(!Validator.isValidData(date)) {
            System.out.println("Дата указана неверно! формат даты: ДД.ММ.ГГГГ");
            return;
        }

        if(!Validator.isValidTelephone(telephone)) {
            System.out.println("Телефон указан неверно!");
            return;
        }

        if(!Validator.isValidGender(gender)) {
            System.out.println("Пол указан неверно! m - мужской, f - женский");
            return;
        }

        String fn = split[0] + ".txt";
        Human human = new Human(lastname, name, surname, date, telephone, gender);
        try (FileWriter writer = new FileWriter(fn, true)) {
            writer.write(human.toString());
            writer.append(' ');
            writer.flush();
            System.out.println("Данные сохранены " + fn);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
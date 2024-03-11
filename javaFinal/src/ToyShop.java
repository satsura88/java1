import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ToyShop {
    private List<Toy> toyArray = new ArrayList<Toy>();
    public PriorityQueue<Toy> toyQueue = new PriorityQueue<>();
    private Map <Integer, String> idAndNames;
    public List<Integer> weights = new ArrayList<>();
    public List<Integer> counts = new ArrayList<>();

    public ToyShop(){
        idAndNames = new HashMap<>();
    }

    public void addToy() {
        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Сколько видов игрушек находятся в магазине?   ");
        int countToys = input.nextInt();
        for (int i = 1; i <= countToys; i++) {
            System.out.println("Введите название игрушки:  ");
            String name = input.next();
            System.out.println("Введите количество игрушек " + name + ":  ");
            int currentCount = input.nextInt();
            System.out.println("Введите вероятность выигрыша игрушки " + name + ":  ");
            int weight = input.nextInt();
            Toy newToy = new Toy(name, currentCount, weight);
            toyQueue.add(newToy);
            toyArray.add(newToy);
            for (int j = 0; j < weight; j++) {
                weights.add(newToy.getId());
            }
            for (int j = 0; j < currentCount; j++) {
                counts.add(newToy.getId());
            }
            idAndNames.put(newToy.getId(), newToy.getName());
            System.out.println("Новая игрушка добавлена!");
        }
        input.close();
    }

    public Toy getToy(){    //розыгрыш
        int index = new Random().nextInt(weights.size());
        int toyId = weights.get(index);
        counts.remove(index);
        weights.remove(index);
        int ost = Collections.frequency(counts, toyId);
        if (ost == 0){
            for (int i = weights.size() - 1; i >= 0; i--) {
                if (weights.get(i) == toyId) {
                    weights.remove(i);
                }
            }
        }
        String name = idAndNames.get(toyId);
        for (Toy toy : toyArray) {
            if (toy.getName().equals(name)) {
                return toy;
            }
        }
        return null;
    }
    public void writeWins() {
        try (PrintWriter writer = new PrintWriter(new File("Wins.txt"))) {
            for (int i = 1; i <= 10; i++) {
                Toy toy = getToy();
                String winner = String.format("%d. %s\n", i, toy.getName());
                writer.write(winner);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Ошибка записи в файл");
        }
        System.out.println("Розыгрыш окончен!");
    }
}
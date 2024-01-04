import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {

        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "20gr", 10);
        Component sugar = new Component("Sugar", "87gr", 80);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, pineceline);

        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(sugar, pineceline);

//        for (Component c : pharmacy2){
//            System.out.println(c);
//        }

        List<Component> list = new ArrayList<>();
        list.add(pineceline);
        list.add(salt);
        list.add(sugar);


        Collections.sort(list);
        System.out.println(list);


        IterablePharmacy pharm1 = new IterablePharmacy();
        pharm1.addComponents(salt, pineceline);

        IterablePharmacy pharm2 = new IterablePharmacy();
        pharm2.addComponents(salt, pineceline);

        System.out.println(pharm1);

        Set<IterablePharmacy> result = new HashSet<>();
        result.add(pharm1);
        result.add(pharm2);
        System.out.println(result.size());

    }

}
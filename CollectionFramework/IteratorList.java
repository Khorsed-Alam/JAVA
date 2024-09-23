package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
    public static void main(String[] args) {
        List<String> Fruits = new ArrayList<>();
        Fruits.add("Kiwi");
        Fruits.add("Papaya");
        Fruits.add("Mango");
        Fruits.add("Apple");

        for(int i=0;i<Fruits.size();i++){
            System.out.println("Fruits is: "+Fruits.get(i));
        }

        System.out.println("\n\nUse for each Loop\n\n\n");

        for(String Fruit:Fruits){
            System.out.println("For ecah Fruits: "+Fruit);
        }

        System.out.println("\n\n Use Iterator \n\n");


        Iterator<String>fr=Fruits.iterator();
        while (fr.hasNext()){
            System.out.println("Iterator: "+fr.next());
        }




    }
}

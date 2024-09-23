package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListInterfacelist {
    public static void main(String[] args) {
        List <Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));// print 1 st index element

        list.set(1,200);// Replace element from specific position
        System.out.println(list);

        list.add(0,100);
        System.out.println(list);// Right shifting and added one element

        list.remove(2);
        System.out.println(list);// Left shifting and remove one element
    }
}

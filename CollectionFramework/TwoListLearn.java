package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TwoListLearn {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);

        List<Integer>list2=new ArrayList<>();
        list2.add(40);
        list2.add(50);
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);

        list1.removeAll(list2);
        System.out.println(list1);

    }
}

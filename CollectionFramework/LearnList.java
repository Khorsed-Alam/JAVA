package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);// Print Full List-->[10, 20, 30]
        System.out.println(list.size());// print List size--->3
        System.out.println(list.contains(300));// Print true or false if element is part of the list

        System.out.println(list.remove(1));// Remove 1 th index element

        list.add(29);
        list.add(35);
        list.add(56);

        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(35)));// Remove Specific element into the list
        System.out.println(list);


    }
}

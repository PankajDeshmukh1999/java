package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySort {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        Collections.sort(list);
        for (String fruit:list){
            System.out.println(fruit);
        }

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Collections.sort(list1);
    }
}

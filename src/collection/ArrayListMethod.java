package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(5);
        list2.add(9);

//        list1.addAll(list2);     // print all number in list1 and list2
//        list1.removeAll(list2);  // remove same element
//        list1.retainAll(list2);    //print common element
//        int j = list1.size()-1;
//        for (int i =0;i<=list1.size()-1;i++){
//            System.out.println(list1.get(i)*list2.get(j));
//            j--;
//        }

//        int i = 0;                              //index start from 0 in condition i
//        for (int j=list2.size()-1;j>=0;j--){    // start from last index
//            System.out.println(list2.get(j)*list1.get(i));
//            i++;
//        }
        int i = list1.size()-1;
        for (int j=list2.size()-1;j>=0;j--){
            System.out.println(list2.get(j)*list1.get(i));
            i--;
        }
    }
}

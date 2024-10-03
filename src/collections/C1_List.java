package collections;

import java.util.*;

public class C1_List {
    public static void main(String[] args) {
        //ArrayList
//        List list1 = new List();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3));
        list1.add(1);
        list1.add(-40);
        list1.sort(Comparator.naturalOrder());
        list1.get(0);
        list1.set(0,-50);
        System.out.println(list1.contains(35));


        //LinkedList
        List<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
    }
}

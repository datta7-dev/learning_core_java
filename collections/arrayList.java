package collections;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        // array list is an dynamic array, it allow us to add/modify array elements.
        // it does not have fix limit.
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(10);// add() method is used to add the new element to arraylist;
        lst.add(20);
        lst.add(30);
        lst.add(50);
        lst.add(60);
        lst.add(70);

        for (int i : lst) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + lst.get(0));// to access the particular element by index from arraylist;

        System.out.println(lst);// we can directly print the arraylist;

        System.out.println(lst.remove(0));// remove the element from arraylist by index;
        System.out.println(lst);

        System.out.println(lst.size());// to know the size/length of the arraylist;

        lst.set(2, 500);// (index,value)set new element at particular index;
        System.out.println(lst);

        Collections.sort(lst);// to sort the arraylist;
        System.out.println(lst);

        // create string type array list;
        ArrayList<String> str = new ArrayList<String>();
        str.add("hi");
        str.add("hello");
        str.add("welcome");
        System.out.println(str);

        // create arraylist which stores all the data type;
        ArrayList common = new ArrayList();
        common.addAll(lst);
        System.out.println(common);
        common.addAll(str);
        System.out.println(common);
        common.add('a');
        common.add('b');
        common.add('c');
        common.add('d');
        System.out.println(common);

    }

}

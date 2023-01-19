package sdf;

import java.util.LinkedList;

public class LinkedListExample {

    public void example() {

        LinkedList<String> ll = new LinkedList<String>();
    
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");
        

        // print out the LinkedList
        // ll.forEach(itm -> System.out.println(itm));
        // Or print it in a line format. Can test the print above and the print below to see the difference.
        System.out.println(ll);


        ll.remove("C");
        // print out the LinkedList
        // ll.forEach(itm -> System.out.println(itm));
        System.out.println(ll);



        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);







    }
}

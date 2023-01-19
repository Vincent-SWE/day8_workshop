package sdf;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public void example() {

        Stack<Integer> stack = new Stack<Integer>();
        

        // pushing or putting something on the stack (FILO, LIFO) First-In-Last-Out
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }


        // pop or taking something from the stack
        for (int i = 0; i < 5; i++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack Item (pop) " + stackItem);
        }


        // see what is the last item on top of the stack
        Integer item = stack.peek();
        System.out.println("Item on top of stack " + item);



        // see what is the first element of the stack
        Integer firstItem = stack.firstElement();
        System.out.println("First element of stack: " + firstItem);



        // search for an item in the stack and return the index where its found on the stack
        Integer idxElement = stack.search(2);
        System.out.println("Stack element found at " + idxElement);



        // iterating through a stack
        Iterator<Integer> its = stack.iterator();
        while (its.hasNext()) {
            Integer StackIt = its.next();
            System.out.println("Iterator stack item: " + StackIt);
        }











    }



}

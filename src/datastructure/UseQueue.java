package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> food=new LinkedList<String>();

        food.add("Cake");
        food.add("Chicken Masala");
        food.add("Beef Curry");
        food.add("Lamb chop");

        food.size();

        food.peek();

        food.remove();

        food.poll();

        Iterator it=food.iterator();

        while(it.hasNext()) {

            System.out.println(it.next());

        }

        for(String st: food)

        {

            System.out.println(" Peek Food: "+food.peek()+", "+ "Remove Food: "+food.remove()+  ","+" Poll Food: "+food.poll());



        }



    }

}

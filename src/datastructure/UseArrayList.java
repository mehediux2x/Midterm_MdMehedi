package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        List<String> name = new ArrayList<>();



        name.add("Roni");

        name.add("Trisha");

        name.add("Sujon");

        name.add("Roy");

        name.add("Hasan");

        name.add("Maliha");



        System.out.println("Retrieving data from ArrayList: " + name);

        System.out.println("Peek element: " + name.get(3));

        System.out.println("Remove element at index 0: " + name.remove(0));

        System.out.println("After removing the element, retrieving data from ArrayList : " + name);



        System.out.println("By using for Loop: ");

        for (String string : name) {

            System.out.println(" "+  string);

        }

        System.out.println();



        System.out.println(" using while Loop with Iterator: ");

        Iterator it = name.iterator();

        while (it.hasNext()) {

            String s = (String) it.next();

            System.out.println(" " +s);

        }

        System.out.println();



        Collections.sort(name);

        System.out.println("After sorting, the ArrayList: "+name);


    }

}

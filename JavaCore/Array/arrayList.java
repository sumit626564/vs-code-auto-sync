package JavaCore.Array;

import java.util.ArrayList;

public class arrayList{
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();

        // add elements
        list.add("apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Pine-Apple");
        list.add("Grapes");

        // Access element
        System.out.println("First elemnt: "+list.get(0));

        // update element
        list.set(1, "Orange");

        // Rmove Element
        list.remove("Mango");   // remove by value
        list.remove(0);    // remove by index

        // Size of list
        System.out.println("Size: " + list.size());

        // Loop through ArrayList
        System.out.println("All elements: ");
        for(String fruit: list){
            System.out.print(fruit);
        }

        System.out.println();
    }
}

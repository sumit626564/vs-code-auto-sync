package JavaCore.Array;

import java.util.ArrayList;

public class arrayList{
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();

        // add elements
        list.add("apple");
        list.add("Banana");
        list.add("Mango");

        // Access element
        System.out.println("First elemnt: "+list.get(0));
        
    }
}

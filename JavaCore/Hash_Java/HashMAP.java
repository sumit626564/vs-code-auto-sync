package JavaCore.Hash_Java;
import java.util.HashMap;

/*
 *  ===========What is a HashMap..?======================
 *  A HashMap is a collection in java that stores key-value pairs.
 *      key--->                 unique (no dulicates)
 *      Value---->              can be duplicate.
 *      Order--->               not guaranted (unsroted)
 *      Nulls---->              allow one {null} key and multiple {null} values
 *      Performance---->        O(1) for get/put operations on average
 * 
 * ================How HashMap Works (Internally)
 *  Java uses a "hashtable" to store data.
 *  Each key is hased (using hashCode())--> determines where to store the value.
 *  If two keys have the same hash (collision) --> it stores them in linked list or tree internally
 * 
 * =====Note:-====
 *                 This is why lookup, insert, and delete are super fast in HashMap.
 */

public class HashMAP {
    public static void main(String[] args) {
        
        // create HashMap
        HashMap<String, Integer> hashmap = new HashMap<>();

        // Insert elements
        hashmap.put("Apple",100);
        hashmap.put("Banana", 60);
        hashmap.put("Mango", 120);
        hashmap.put("Orango", 70);

        // print all dictionary
        System.out.println("Initial HashMap: " + hashmap);

        // Search in HashMap
        if(hashmap.containsKey("Mango")){
            System.out.println("Price fo Mango: "+hashmap.get("Mango"));
        }

        // Update a value:
        hashmap.put("Banana", 700);  // replace old value
        System.out.println("Updated Banana Price: " + hashmap.get("Banana"));

        System.out.println(hashmap);
    }    
}

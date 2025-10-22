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
 * 
 * ===============================================================================================================
 * 
 *  Important HashMap Methods
 *  |        Method                 |           Description                          |
    | ----------------------------- | ---------------------------------------------- |
    | `put(K key, V value)`         | Adds key-value pair (or updates if key exists) |
    | `get(Object key)`             | Returns value for a key                        |
    | `remove(Object key)`          | Deletes a key-value pair                       |
    | `containsKey(Object key)`     | Checks if a key exists                         |
    | `containsValue(Object value)` | Checks if a value exists                       |
    | `keySet()`                    | Returns all keys                               |
    | `values()`                    | Returns all values                             |
    | `entrySet()`                  | Returns all key-value pairs as Set<Entry<K,V>> |

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

        // Loop through HashMap
        for(String key: hashmap.keySet()){
            System.out.println(key + " --> "+ hashmap.get(key));
        }
    }    
}

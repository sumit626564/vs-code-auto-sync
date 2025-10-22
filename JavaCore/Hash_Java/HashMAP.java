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
        HashMap<String, Integer> hashmap = new HashMap<>()
    }    
}

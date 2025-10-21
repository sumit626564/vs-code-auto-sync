package JavaCore.HashMapOver;
import java.util.HashSet;
import java.util.Iterator;

/* HashSet in Java
 *  Insert/Add - O(1)
 *  Search/ Contains - O(1)
 *  Delete/ Remove - O(1)
 * 
 *  Note:- HashSet store only unique Element
 *       
 *  Syntax:-
 *          HashSet<DataType> setname = new HashSet<>();
 */

public class Hashing {
    public static void main(String[] args){
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);  
        set.add(3);
        set.add(2);
        set.add(8);
        set.add(1);  // list(el)

        // Search - contains
        if(set.contains(1)){
            System.out.println("Set Contains: 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not Contains ");
        }
        /*============================================================ */
        // Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contains 1 - we deleted");
        }

        /*=================================================================== */

        // Size
        System.out.println("size of set is :" + set.size());

        /*===================================================================== */
        // Print all element
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        // hash
    }
}

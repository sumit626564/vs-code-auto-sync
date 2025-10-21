package JavaCore.HashMapOver;
import java.util.HashSet;

/* HashSet in Java
 *  Insert/Add - O(1)
 *  Search/ Contains - O(1)
 *  Delete/ Remove - O(1)
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
        set.add(2);
        set.add(3);
        set.add(1); // list(el)

    }
}

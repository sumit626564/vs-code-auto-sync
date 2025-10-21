package JavaCore.HashMapOver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PraticeHash {

    public static void main(String[] args){

        // User input Method 
        Scanner input = new Scanner(System.in);

        int[] size_arr = new int[3];        // array size decliration
        System.out.println("Enter 3 Number: ");
        for(int i=0; i<size_arr.length; i++){
            size_arr[i] = input.nextInt();
        }
/*========================================================================================= 
 * ########## HasSet ############################
*/
        HashSet<Integer> new_arr = new HashSet<>();

        // Step 2: Add elements from array into HashSet
        for(int num : size_arr){
            new_arr.add(num);
        }
        
        // Step 3: Iterate using Iterator
        System.out.println("\nIterating HashSet Elements:");
        Iterator it = new_arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Search- Contains;
        if((!new_arr.contains(3)) || (!new_arr.contains(7))){
            System.out.println("True");
        }
        System.out.println("Hash Element: "+  new_arr);

        input.close();
    }
}
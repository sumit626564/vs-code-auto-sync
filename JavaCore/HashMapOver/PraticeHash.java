package JavaCore.HashMapOver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public clas


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
        Iterator<Integer> it = new_arr.iterator();
        // {my Method} =  Iterator it = new_arr.iterator();   Note:- this method is also work well but above is neat and celan
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Step 4:  Search using contains()
        if((!new_arr.contains(3)) || (!new_arr.contains(7))){
            System.out.println("\n True (because either 3 or 7  is mssing)");
        }

        // Step 5: Print the entire HasSet
        System.out.println("Hash Element: "+  new_arr);

        input.close();
    }
}
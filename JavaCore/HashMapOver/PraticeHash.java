package JavaCore.HashMapOver;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class HasSetSingleArray{
    int[] single_arr;

    public HasSetSingleArray(int[] single_arr){
        this.single_arr = single_arr;
    }
    public void TakingInput(Scanner input){
        for(int i=0; i<single_arr.length; i++){
            single_arr[i] = input.nextInt();
        }
    }
    /*===================================================================== */

    public void HashDecliration() {
        //################## Decliration of HasSet Section ########
        HashSet<Integer> new_arr = new HashSet<>();

        // Step 2: Add elements from array into HashSet
        for(int num : single_arr){
            new_arr.add(num);
        }

        // Step 3: Iterate using Iterator
        System.out.println("\nIterating HashSet Elements: ");
        Iterator<Integer> it =  new_arr.iterator();   // Decliaation of Iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Step 4: Search using contains()
        if((!new_arr.contains(3)) || (!new_arr.contains(7))){
            System.out.println("\n True {Becuase either 3 or 7 is Missing}");
        }

        // Step 5: Print the entire
        System.out.println("Hash Element: "+ new_arr);
    }
}

class DoubleArray{
    int[][] doublearray;

    public DoubleArray(int[][] double_array){
        this.doublearray = double_array;
    }
    public void TakingDouble(Scanner input){
        for(int i=0; i<doublearray.length; i++){
            doublearray[i][i] = input.nextInt();
        }
    }
    /*=========================Hasing with Dual Array===================================== */
    public void HashDoubleDecliration(){
        
        HashSet<Integer> array_double = new HashSet<>();

        for(int[] num : doublearray){
            array_double.add([doublearray]);
        }
    }
}
public class PraticeHash {

    public static void main(String[] args){

        // User input Method 
        Scanner input = new Scanner(System.in);

        int[] size_arr = new int[3];        // array size decliration
        System.out.println("Enter 3 Number: ");
        HasSetSingleArray hcl = new HasSetSingleArray(size_arr);
        hcl.TakingInput(input);
        hcl.HashDecliration();
        
        input.close();
    }
}
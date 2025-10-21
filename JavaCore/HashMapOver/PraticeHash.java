package JavaCore.HashMapOver;
import java.util.HashSet;

public class PraticeHash {

    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 9, 7, 5};
        HashSet<Integer> new_arr = new HashSet<>();

        for(int num : arr){
            new_arr.add(num);
        }

        // Search- Contains;
        if((!new_arr.contains(3)) || (!new_arr.contains(7))){
            System.out.println("True");
        }
        System.out.println("Hash Element: "+  new_arr);

    }
}
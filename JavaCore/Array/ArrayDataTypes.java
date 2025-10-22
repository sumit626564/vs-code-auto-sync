package JavaCore.Array;

import java.util.ArrayList;

public class ArrayDataTypes {
    public static void main(String[] args){
        ArrayList<Object> mixed = new ArrayList<>();
        mixed.add("Sumit Singh");   // String
        mixed.add(23);              // Integer
        mixed.add(89.5f);           // Float

        // print element
        System.out.println("Your List: "+ mixed);
    }
}

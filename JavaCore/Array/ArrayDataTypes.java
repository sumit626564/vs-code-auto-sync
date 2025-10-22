package JavaCore.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDataTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Object> mixed = new ArrayList<>();
        mixed.add("Sumit_Singh");   // String
        mixed.add(23);              // Integer
        mixed.add(89.5f);           // Float
        mixed.add("rajputsinghshear@gmail.com");

        // Search for a specific element
        System.out.print("Enter your searchItem: ");
        String searchItem = input.nextLine();
        if(mixed.contains(searchItem)){
            System.out.println(searchItem + " found at index: "+ mixed.indexOf(searchItem));
            System.out.println(searchItem);
        }else{
            System.out.println("Not Found:.....!");
        }

        // print element
        System.out.println("Your List: "+ mixed);

        input.close();
    }
}

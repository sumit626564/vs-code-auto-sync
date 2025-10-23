package JavaCore.Array.search;

import java.util.ArrayList;
import java.util.Scanner;

public class CaseSenstiveSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Sumit");
        names.add("Rahul");
        names.add("Ravi");
        names.add("ALEX");

        // Search by data
        System.out.print("Enter Data What: ");
        String searchName = input.nextLine();
        boolean found = false;
        for(String name : names){
            if(name.equalsIgnoreCase(searchName)){
                System.out.println("Found: "+ name);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Not Found");
        }
        input.close();
    }
}

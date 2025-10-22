package JavaCore.Hash_Java;

import java.util.HashMap;
import java.util.Scanner;

public class InputHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> hashInput = new HashMap<>();
        System.out.println("How many times do you want to enter ?");
        int n = input.nextInt();
        input.nextLine();
        for(int i=0; i<n; i++){
            System.out.print("Enter your item: ");
            String key = input.nextLine();
            System.out.print("Enter your value: ");
            int value = input.nextInt();
            input.nextLine();   // Consume the leftover newline

            hashInput.put(key, value);
        }
        System.out.println("\nItems in the map: ");
        for(String key : hashInput.keySet()){
            System.out.println( "user  data: " + key +" ==> " + hashInput.get(key));
        }


    }
}

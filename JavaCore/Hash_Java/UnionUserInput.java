package JavaCore.HashMapOver;

import java.util.HashSet;
import java.util.Scanner;

public class UnionUserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // First Set
        System.out.println("Enter number of element for Set 1: ");
        int n1 = input.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        System.out.println("Enter elements for set 1:");
        for(int i = 0; i < n1; i++){
            set1.add(input.nextInt());
        }

        // Second Set
        System.out.println("Enter of elments for  Set 2:");
        int n2 =  input.nextInt();
        HashSet<Integer> set2 = new HashSet<>();
        System.out.println("Enter elements for Set 2:");
        for(int i = 0; i<n2; i++){
            set2.add(input.nextInt());
        }

        // Union of Set1 and Set2
        HashSet<Integer> unionset = new HashSet<>(set1); // copy set1
        unionset.addAll(set2);  // add elements of set2

        System.out.println("Union of Set 1 and Set 2: " + unionset);

        input.close();

    }
}

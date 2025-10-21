package JavaCore.HashMapOver;

import java.util.HashSet;
import java.util.Scanner;

public class UnionUserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // First Set
        System.out.println("Enter element of Set 1 separated by sapce: ");
        int n1 = input.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        System.out.println("Enter elements for set 1:");
        for(int i = 0; i < n1; i++){
            set1.add(input.nextInt());
        }

        // Second Set
        System.out.println("Enter of elments for  Set 2: ");
    }
}

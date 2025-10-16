package JavaCore.Array;

import java.util.Scanner;

public class HackerArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int narray = input.nextInt();

        // creating array
        int[] simple = new int[narray];
        while (narray > 1) {
            simple[narray] = input.nextInt();
        }
        System.out.println("Phy: "+ simple);
        

        input.close();

    }
}
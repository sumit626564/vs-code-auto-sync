package JavaCore.Array;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int narray = input.nextInt();

        // creating array
        int[] simple = new int[narray];
        for(int i = 0; i<narray; i++){
            simple[i] = input.nextInt();
            i++;
        }
        System.out.println("Phy: ");
        for(int elment : simple){
            System.out.println(elment + " ");
        }

        input.close();

    }
}
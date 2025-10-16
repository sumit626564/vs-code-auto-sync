package JavaCore.Array;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int NumberArray = input.nextInt();
        int[] arr = new int[NumberArray];
        for(int i = 0; i < NumberArray; i++){
            arr[i] = input.nextInt();
        }
        int local = 0;
        for(int j=0; j < arr.length; j++){
            local += arr[j];
        }
        System.out.print("Output: "+ local);
        input.close();
    }
}
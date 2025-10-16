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
        // Decide matrix size (nearest square)

        System.out.print("Enter number of row: ");
        int rows = input.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = input.nextInt();
        System.out.println();

        System.out.println("\n Matrix (" + rows + " x "+ cols + "):");
        input.close();
    }
}
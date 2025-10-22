package JavaCore.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class CaseInsensitive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Sumit");
        names.add("Rahul");
        names.add("Ravi");
        names.add("ALEX");

        // Search by data
        System.out.print("Enter Data What");
        String searchName = input.nextLine();

        input.close();
    }
}

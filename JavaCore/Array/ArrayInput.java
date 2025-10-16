package JavaCore.Array;

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizearr = input.nextInt();
        int[] storearr = new int[sizearr];
        for(int i = 0; i<sizearr; i++){
            storearr[i] = input.nextInt();
        }
        int count = 0;
        for(int j = 0; j<sizearr; j++){
            for(int m = 0; m<sizearr; m++){
                
                if(j != m && ((storearr[j] - storearr[m] % (j - m) == 0 && (storearr[j] - storearr[m]) / (j-m) == 1 )){
                    count++;
                }
                System.out.println(count);
            }   
        }
        input.close();
    }
}
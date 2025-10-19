package JavaCore.PracticeSet;

import java.util.Scanner;

public class PraticeOne {
    public static String Declmination(int topicA, int topicB, int topicC, int topicX){
        if(topicA == topicX || topicB == topicX || topicC == topicX){
            return "yes";
        }else{
            return "No";
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int topicA = input.nextInt();
        int topicB = input.nextInt();
        int topicC = input.nextInt();
        int topicX = input.nextInt();
        System.out.println(Declmination(topicA, topicB, topicC, topicX));
        input.close();
    }
}
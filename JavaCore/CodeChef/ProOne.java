package JavaCore.CodeChef;

import java.util.Scanner;

class FootBallMatch{
    int currA, currB, laterC, laterD;

    // constructor
    FootBallMatch(int currA, int currB, int laterC, int laterD){
        this.currA = currA; 
        this.currB = currB;
        this.laterC = laterC;
        this.laterD = laterD;
    }
    

    // Function to check if future Score is Possible
    public String CheckPossible(){
        if(laterC >= currA && laterD >= currB){
            return "POSSIBLE";
        }else{
            return "IMPOSSIBLE";
        }
    }
}
public class ProOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int testcase = input.nextInt();  // dynamic number of test cases
        for(int i = 1; i <= testcase; i++){
            int currA = input.nextInt();
            int currB = input.nextInt();
            int laterC = input.nextInt();
            int laterD = input.nextInt();

            // Create object and call function
            FootBallMatch match = new FootBallMatch(currA, currB, laterC, laterD);
            System.out.println(match.CheckPossible());
        }
        input.close();
    }
}
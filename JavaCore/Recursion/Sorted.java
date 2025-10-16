package JavaCore.Recursion;

public class Sorted {
    public static void main(String[] args){
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N % 2 == 0 && (N > 2 && N < 5)){
            System.out.println("Not Weird");
        }else if(N % 2 == 0 && (N >6 && N < 20)){
            System.out.println("Weird");
        }else{
            System.out.println("Weird");
        }
    }
}

package JavaCore.LeetCode;

public class Demo {
    public static void main(String[] args) {
        int[] newarr = {2, 3, 4, 12, 5, 7};
        int start = 0;
        int end = newarr.length-1;
        while(start < end){
            int temp = newarr[start];
            newarr[start] = newarr[end];
            newarr[end] = temp;
            start++;
            end--;
            
        }
        for(int num : newarr){
            System.out.print(num);
        }
        System.out.println();
    }
}

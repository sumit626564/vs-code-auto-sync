package JavaCore.LeetCode;

public class Demo {
    public static void main(String[] args) {
        int[] newarr = {1, 2, 3, 5};
        for(int i=0; i<newarr.length-1; i++){
            for(int j=newarr.length-1; j>=0; j--){
                int temp = newarr[i];
                newarr[i] = newarr[j];
                newarr[j] = temp;
                i++;
                j--;
                System.out.println(temp);
            }
        }
    }
}

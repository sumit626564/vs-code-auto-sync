package JavaCore.FileHandeling;
import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File NewDelete = new File("stu.txt");
        if(NewDelete.delete()){
            System.out.println("Delete Done....!");
        }else{
            System.out.println("Error.......!");
        }
    }
}

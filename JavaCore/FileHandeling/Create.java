package JavaCore.FileHandeling;
import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args){
        try{
            File newfile = new File(stu.txt);
            if(newfile.createNewFile()){
                System.out.println("Task completed: "+ newfile.getName());
            }else{
                System.out.println("Sorry Not Completed....!");
            }
        }catch (IOException e){
            System.out.println("Error....!");
            e.printStackTrace();
        }
    }
}

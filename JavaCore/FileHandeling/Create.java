package JavaCore.FileHandeling;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try{
            File newfile = new File('stu.txt');
            if(newfile.createNewFile())
        }
    }
}

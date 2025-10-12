package JavaCore.FileHandeling;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try{
            FileWriter newfile = new FileWriter("stuu.txt");
            newfile.write("This is name");
            newfile.write("Name: Sumit Singh");
            newfile.write("BTech");

            newfile.close();   /// compulsory
            System.out.println("File has been writtend into.");
        }catch(IOException e){
            System.out.println("Error.....!");
            e.printStackTrace();
        }
    }
}
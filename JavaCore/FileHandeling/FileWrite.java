package JavaCore.FileHandeling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter newdata = new FileWriter("stuu.txt");
            String datainsert = "Artifical Intelligence(AI) is the simulation of human intelligence"+"in machines that are programmed to think humans and mimic their actions. " +
                                "The term may also be applied to any machine that exhibits traits associated";
            newdata.write("null");

        }
    }
}
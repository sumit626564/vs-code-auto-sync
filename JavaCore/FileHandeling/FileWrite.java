package JavaCore.FileHandeling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter newdata = new FileWriter("stuu.txt");
            String datainsert = "Artifical Intelligence(AI) is the simulation of human intelligence"+"in machines that are programmed to think humans and mimic their actions. " +
                                "The term may also be applied to any machine that exhibits traits associated with"+
                                "a human mind such as learning and problem-solving.";
            newdata.write(datainsert);
            newdata.close();

            System.out.println("Paragraph written successfully!");

        }catch (IOException e){
            e.printStackTrace();   // use for if any error come  in my program, then it will be show ind Details
        }
    }
}
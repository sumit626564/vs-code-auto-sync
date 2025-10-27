package JavaCore.MultiThreading.Pratice_Set_Thread;

class PraticeThreadOne extends Thread{
    public void run(){
        while (true) {
            try{
                Thread.sleep(30 );
            }catch(Exception e){
                System.out.println(e);
            } 
            System.out.println("Good Morning");
        }
    }
}
class PraticeThreadTwo extends Thread{
    public void run(){
        while (true) {
            try{
                Thread.sleep(30 );
            }catch(Exception e){
                System.out.println(e);
            } 
            System.out.println("Welcome");
        }
    }
}
public class Practice_One {
    public static void main(String[] args) {
        PraticeThreadOne p1 = new PraticeThreadOne();
        PraticeThreadTwo p2 = new PraticeThreadTwo();

        // start thread
        p1.start();
        p2.start();


    }
}

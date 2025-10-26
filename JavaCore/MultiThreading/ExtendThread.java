package JavaCore.MultiThreading;


class Mythread1 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("My thread is Running");
            System.out.println("I am Happy");
        }
        
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println("Thread 2 is good..!");
            System.out.println("I am Sad");
        }
        
    }
}
public class ExtendThread {
    public static void main(String[] args) {
        
    }
}

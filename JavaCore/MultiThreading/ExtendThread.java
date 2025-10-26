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
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am Sad");
        }
        
    }
}
public class ExtendThread {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();    // use for start thread
        t2.start();

    }
}

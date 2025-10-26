package JavaCore.MultiThreading;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread 1 not a threat 1");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2 not a threat 2");
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        t1.start();
    }
}

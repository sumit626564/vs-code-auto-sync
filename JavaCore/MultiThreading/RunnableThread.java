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
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        //t1.start();  // we are not abe to run using t1.start

        gun1.start();
        gun2.start();
    }
}

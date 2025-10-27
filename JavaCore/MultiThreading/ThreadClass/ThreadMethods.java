package JavaCore.MultiThreading.ThreadClass;


class MyNewThread1 extends Thread{
    
    public void run(){
        int i =0;
        while (i<1000) {
            System.out.println("Thank_you " +  this.getName());
        } 
        
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();

        t1.start();
        t2.start();  
       // t1.join();// this could be show the error because may t1.start() has already ended
       try {
        t1.join();
       } catch (Exception e) {
        System.out.println(e);
       }
    }
}

class MyNewThread2 extends Thread{
    
    public void run(){
        while (true) {
            System.out.println("MY Thank_you " +  this.getName());
        } 
        
    }
}


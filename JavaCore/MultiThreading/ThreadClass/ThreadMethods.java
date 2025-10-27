package JavaCore.MultiThreading.ThreadClass;


class MyNewThread1 extends Thread{
    
    public void run(){
        while (true) {
            System.out.println("Thank_you " +  this.getName());
        } 
        
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        
    }
}

class MyNewThread2 extends Thread{
    
    public void run(){
        while (true) {
            System.out.println("Thank_you " +  this.getName());
        } 
        
    }
}


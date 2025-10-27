package JavaCore.MultiThreading.Pratice_Set_Thread;

/* 
 * Question 1:
 *          Write a Program to print "Good Morning" and "Welcome" Continuously on the screen in Java Using Threads. 
 * 
 * Question 2:
 *           Add a Step method in Welcome  Thread of 
*/
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

        // set Priority
        p1.setPriority(6);
        p2.setPriority(9);

        // if you want to see priority
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

        // start thread
        //p1.start();
        //p2.start();


    }
}

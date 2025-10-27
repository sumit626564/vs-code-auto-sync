package JavaCore.MultiThreading.ThreadClass;

/* Background Information:
 *  Java Threads
 *      The JVM defines a range of ten logical priorities for Java Thread, including:
 *      sytnax:-
 *              java.lang.Thread.MIN_PRIORITY = 1
 *              java.lang.Thread.NORM_PRIORITY = 5
 *              java.lang.Thread.MAX_PRIORITY = 10
 * 
 * These values [1..10] are passed into Thread."setPriority(int)" to assign priorities to java thread. The Default priority of a Java thread is NORM_PRIORITY. (A Java thread that doesn't explicitly call "setPriority" runs at NORM_PRIORITY.)
 * A JVM is free to implement priorities in any way it chooses, including ignoring the value.
 * The Java HotSpot virtual machine currently associates each Java Thread with a unique native thread. The relationship between the Java thread and the 
 */

public class ThreadPriority {

    public static void main(String[] args) {
        /* Ready Queue: T1, T2, T3, T4, T5 */

    }
}
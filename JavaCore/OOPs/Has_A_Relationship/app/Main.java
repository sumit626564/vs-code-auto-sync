package JavaCore.OOPs.Has_A_Relationship.app;


/* If i have 
 *      if i have 20, {7 folder 13 file} inside the Has-a-relationship:-
 *          Syntax:- 
 *                  Option 1: Compile All at Once (Best Way)
 *                       //      javac JavaCore/OOPs/Has_A_Relationship/**/*.java //

 */
// Import Method
import JavaCore.OOPs.Has_A_Relationship.car.Car;
import JavaCore.OOPs.Has_A_Relationship.engine.Engine;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("audi", 10000, new Engine(269));
        c.display();
    }
}

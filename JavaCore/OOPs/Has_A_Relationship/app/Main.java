package JavaCore.OOPs.Has_A_Relationship.app;

// Import Method
import JavaCore.OOPs.Has_A_Relationship.car.Car;
import JavaCore.OOPs.Has_A_Relationship.engine.Engine;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("audi", 10000, new Engine(269));
        c.display();
    }
}

package JavaCore.OOPs.Has_A_Relationship.car;

// file system

/*// Import the engine  class from   another  package */
import JavaCore.OOPs.Has_A_Relationship.engine.Engine;


public class Car {
    String name;
    int price;
    Engine engine; // has-a relationship

    public Car(String name, int price, Engine engine){
        this.name = name;
        this.price = price;
        this.engine = engine;
    }

    public void display(){
        System.out.println("Car Name: "+ name);
        System.out.println("Price : "+ price);
        System.out.println("Engine Power: "+ engine);
    }
}

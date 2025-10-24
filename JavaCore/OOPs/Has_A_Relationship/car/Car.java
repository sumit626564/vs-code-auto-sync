package JavaCore.OOPs.Has_A_Relationship.car;

// file system

import engine.Engine; // Import the engine  class from   another  package


public class Car {
    String name;
    int price;
    Engine engine; // has-a relationship

    public Car(String name, int price, Engine engine);
}

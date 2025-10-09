package JavaCore.OOPs;

public class AbstractMehtod {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class animal{
    // Constructor
    String color;
    animal(){
        
    }
    /* Non-Abstraction function */
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); 
    // Walk in 
     // we no need to implemnt current class we will implemnt in next class
}

class Horse extends animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
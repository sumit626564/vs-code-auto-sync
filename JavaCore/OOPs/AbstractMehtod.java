package JavaCore.OOPs;

public class AbstractMehtod {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        
    }
}

abstract class animal{

    // Constructor
    String color;
    //animal(){
    //    color = "brown";  // by default create color "brown"
    //}
    animal(){
        System.out.println("animal constructor called");
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
    // Dervied constructor  which we are created in above class
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changeColor(){
        color = "dark Brown";
    }

    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang are the braed of Horse");
    }
}

class Chicken extends animal {
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
package JavaCore.OOPs;

public class AbstractMehtod {
    public static void main(String[] args) {
        
    }
}

abstract class animal{
    /* Non-Abstraction function */
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();  // we no need to implemnt current class we will implemnt in next class
}

class Horse extends animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animla {

}

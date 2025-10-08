package JavaCore.OOPs;

public class Inheritance {
    
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();
    }
}

// base class
class Animal{
    String color;

    // create function
    void eat() {
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

// Derived Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }

}


/* Types of Inheritance
 * Single Level Iheritance
 *          {Base Class}
 *               |
 *               |
 *          {Derived Class}
 */
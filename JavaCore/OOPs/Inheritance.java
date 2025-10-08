package JavaCore.OOPs;

public class Inheritance {
    
    public static void main(String[] args) {
        //Fish shark = new Fish();
        //shark.eat();
        //shark.breath();
        //shark.swim();

        Dog dooby = new Dog();
        dooby.eat();
        dooby.legs = 4;
        System.out.println(dooby.legs);
    }
}

// Note :- Inheritance & Single Level Inheritance both are same

/* Types of Inheritance
 * Single Level Iheritance
 *          {Base Class}
 *               |
 *               |
 *          {Derived Class}
 */

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

// Multi Level Inheritance
/*
 *          {Base Class}
 *               |
 *               |
 *          {Derived Class}
 *               |
 *               |
 *          {Derived Class}    
 */

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals {
    String breed;
}


// Hierarchical Inheritance
/*
 *                  {Base Class}
 *                       |
 *        ---------------------------------
 *        |                               |
 *        |                               |
 *     {Derived Class}               {Derived Class}
 */
package JavaCore.OOPs;

public class Inheritance {
    
    public static void main(String[] args) {

         //Single Inheritance
        //Fish shark = new Fish();
        //shark.eat();
        //shark.breath();
        //shark.swim();

        //// Multilevel Inheritance
        //Dog dooby = new Dog();
        //dooby.eat();
        //dooby.legs = 4;
        //System.out.println(dooby.legs);
//
        //// Hierarchical Inheritance
        //Bird bird = new Bird();
        //bird.eat();
        //bird.fly();

        Animal an =  new Animal();
        an.color = "blue";
        System.out.println("The colour is: "+an.color);
        an.eat();
        an.breath();
        an.swim();
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
 *    {Derived Class}                 {Derived Class}
 */

class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class fish extends Animal{
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}
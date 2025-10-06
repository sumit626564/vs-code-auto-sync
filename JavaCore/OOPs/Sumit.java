package JavaCore.OOPs;


class Car{
    void Vechicle(){
        System.out.println("This is a Vechicle `Xuv100` ");
    }
}
class Bike extends Car{
    void Display(){
        System.out.println("This is Bike Model Number: `U13231083K3`");
    }
}
public class Sumit {
    
    public static void main(String[] args){
        Bike bk = new Bike();
        bk.Vechicle();  // Print Vechicle Model name
        bk.Display();  // Print Bike Model Number
    }
}

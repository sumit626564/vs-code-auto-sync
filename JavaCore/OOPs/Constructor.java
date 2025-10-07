package JavaCore.OOPs;

class Tractor{
    String model;
    int roll;

    // Constructor 1: takes a  string
    Tractor(String name){
        this.model = name;
    }
    // Constructor 2: takes a int
    Tractor(int Roll){
        this.roll = Roll;
    }
    // Constructor 3: takes two strings (optional)
    Tractor(String brand, String Number){
        this.model = brand + " " + Number
    }
}
public class Constructor {
    
    public static void main(String[] args) {
    }
}

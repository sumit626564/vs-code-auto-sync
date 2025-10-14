package JavaCore.OOPs;

class PersonClass{
    PersonClass(){
        System.out.println("Person Constructor");
    }
}

class Employee extends PersonClass {
    Employee(){
        super();  // calling parent class constructor
        System.out.println("Employee Constructor");
    }
}

public class ConstructorChaningParentClass {
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}

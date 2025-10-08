package JavaCore.OOPs;

/* There are three type of Constructor
 *  1. Non-Paraemterized
 *  2. Parameterized
 *  3. Copy Constructor
 */

class father{
    String name;
    int age;

    // Non-Parameterized Constructor
    father(){
        System.out.println("Your Father Name is: Mr. Bhaskar Singh");
    }

    // Parameterized Constructor
    father(String name, int age){
        this.name = name;
        this.age = age;
    }
}

 // #################//#endregion#######################
class Tractor{
    String model;
    int roll;
    String password;

    // Constructor 1: takes a  string
    Tractor(String name){
        this.model = name;
    }
    // Constructor 2: takes a int
    Tractor(int Roll){
        this.roll = Roll;
    }
    // Constructor 3: takes two strings (optional)
    Tractor(String brand, String number){
        this.model = brand + " " + number;
    }

    Tractor(Tractor other){
        this.model = other.model;
        this.roll = other.roll;
        this.password = other.password;
    }
}

// Copy Constructor :  One single object1  copy properties to 2nd properties and ..etc

public class Constructor {
    
    public static void main(String[] args) {
        Tractor t1 = new Tractor("Eicher 380");
        System.out.println(t1.model);
        Tractor t2 = new Tractor("Eicher","380");
        System.out.println(t2.model);
        
        Tractor t3 = new Tractor(t1);
        System.out.println("Copied Tractor modle: " + t3.model);

        // type Constructor in java
            // call non-parameterized
        father fh = new father();
            //  call parameterized
        father fh2 = new father("Bhaskar Singh", 45);
        System.out.println("Your Father Name: "+fh2.name);
        System.out.println("Your Father Age: "+fh2.age);

        // Copy Constructor
        

    }
}

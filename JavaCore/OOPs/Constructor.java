package JavaCore.OOPs;

class Tractor{
    String model;
    int roll;

    Tractor(String name){
        this.model = name;
    }
    Tractor(int Roll){
        this.roll = Roll;
    }
}
public class Constructor {
    
    public static void main(String[] args) {
        Tractor tr = new Tractor("Eicher 380");
        System.out.println(tr.model);
        Tractor tr = new Tractor("Eicher" "380" );
    }
}

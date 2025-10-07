package JavaCore.OOPs;

class Tractor{
    String model;
    int roll;

    Tractor(String name){
        this.model = name;
    }
}
public class Constructor {
    
    public static void main(String[] args) {
        Tractor tr = new Tractor("Eicher 380");
        System.out.println(tr.model);
    }
}

package JavaCore.OOPs;


class laptop{
    void print(){
        System.out.println("Laptop HP Brand AMD Ryzen");
    }
}
class hp extends laptop{
    void print(){
        System.out.println("Base class(Laptop)");
    }
}
public class sumit {

    public static void main(String[] args) {
        laptop obj1 = new hp();
        obj1.print();
        laptop obj2 = new laptop();
        obj2.print();
    }
}
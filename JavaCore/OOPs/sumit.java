package JavaCore.OOPs;


class laptop{
    String name;
    int year_old;
    String processor;

    void Datacess(String nme, int old, String proc){
        name = nme;
        year_old = old;
        processor = proc;
    }
}
public class sumit {

    public static void main(String[] args) {
        laptop lp = new laptop();
        lp.name = "HP";
        System.out.println("Your Laptop Brand Name: "+ lp.name);
        lp.processor = "Ryzen 5 5500U";
        System.out.println("Processor: "+ lp.processor);
        lp.year_old = 2;
        System.out.println("Year Old: "+ lp.year_old);
    }
}
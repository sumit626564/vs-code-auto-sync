package JavaCore.OOPs;

public class sumit {
    public static void main(String[] args) {
        mother fh = new mother();
        fh.namesu = "Bhaskar Singh";
        System.out.println("Father Name: "+fh.namesu);
        fh.age = 54;
        System.out.println("Father Age: "+ fh.age);
    }
}
class Singh{
    String name;
    int weight;
}
class mother extends Singh{
    int age;
    String namesu;
}

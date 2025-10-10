package JavaCore.OOPs;

public class sumit {
    public static void main(String[] args) {
        mother mh = new mother();
        mh.fathername = "Bhaskar Singh";
        System.out.println("Father Name: "+mh.fathername);
        mh.age = 54;
        System.out.println("Father Age: "+ mh.age);
    }
}
class Singh{
    String name;
    int weight;
}
class mother extends Singh{
    int age;
    String fathername;
}

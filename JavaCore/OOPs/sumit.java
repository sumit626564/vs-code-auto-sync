package JavaCore.OOPs;

public class sumit {
    public static void main(String[] args) {
        father fh = new father();
        fh.fathername = "Bhaskar Singh";
        System.out.println("Father Name: "+fh.fathername);
        fh.age = 54;
        System.out.println("Father Age: "+ fh.age);
    }
}
class Singh{
    String name;
    int weight;
}
class father extends Singh{
    int age;
    String fathername;
}

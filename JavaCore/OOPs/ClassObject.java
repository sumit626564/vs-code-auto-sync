package JavaCore.OOPs;

public class ClassObject {

    public static void main(String[] args){

    }
}

// pen is object 

class Pen{
    // Properties  & Function
    // Below the String and int is properties
    /* String color
     * int tip
     */

    String color;
    int tip;

    // creating function
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;  // CGPA

    void calPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}
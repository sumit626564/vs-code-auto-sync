package JavaCore.OOPs;

/*Getters & Setters
 *      Get: to return the value
 *      Set: to modfiy the value
 * 
 * Note:- "this": this keyword is used to refer to the current object
 */

class Pencil{
    private String color;
    private int tip;

    // Getter function
    String getColor(){
        return this.color;  // this is special keywords in java, which is point to particular properties
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String color_new){
        color = color_new;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
public class GetterSetter{
    
    public static void main(String[] args) {
        Pencil pen = new Pencil();  // call by Object
        pen.setColor("Brown");
        System.out.println(pen.getColor()); // return blue
        pen.setTip(5);
        System.out.println(pen.getTip());
        pen.setColor("Yellow");
        System.out.println(pen.getColor());
    }
}

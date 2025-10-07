package JavaCore.OOPs;

/*Getters & Setters
 *      Get: to return the value
 *      Set: to modfiy the value
 * 
 * Note:- "this": this keyword is used to refer to the current object
 */

public class GetterSetters {
    
    public static void main(String[] args) {
        
    }
}

class Pen{
    String color;
    int tip;

    // Getter function
    String getColor(){
        return this.color;  // this is special keywords in java, which is point to particular propertip
    }
    int getTip(){
        return this.tip;
    }
    
    // Setter function
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

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

    int getColor(){
        return this.color;
    }

    // Setter function
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

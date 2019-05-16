package SuperClasses;

/**
 * Created by lovel on 20-Jan-19.
 */
public class SuperClass extends SuperClassEx {
    int maxSpeed=180;
    void display(){
        System.out.println("Maximum Speed:"+super.maxSpeed);
    }
    public static void main(String args[]){
        SuperClass sp= new SuperClass();
        sp.display();
    }
}

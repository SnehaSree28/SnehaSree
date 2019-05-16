/**
 * Created by lovel on 28-Oct-18.
 */
public class Constructor {
    int rollNo;
    String sname;
    Constructor(int r,String name){
        rollNo=r;
        sname=name;
    }
    public static void main(String args[]){
        Constructor c1= new Constructor(1,"sneha");
        System.out.println(c1);

    }
    public String toString(){
        return rollNo +sname;
    }
}

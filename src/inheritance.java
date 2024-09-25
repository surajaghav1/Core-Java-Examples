import javax.swing.*;

class Base{
    int rollno;
    String name;
    }
class Derived extends Base{
    public  void set(int r,String name){
        rollno=r;
        this.name=name;
    }
    public  void display(){
        System.out.println("roll NO is ; "+this.rollno);
        System.out.println("Name is : "+this.name);
    }
}
public class inheritance {
    public static void main(String[] args) {

//
        Derived d=new Derived();
        d.set(100,"Suraj");
        d.display();
    }
}

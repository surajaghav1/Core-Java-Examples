
abstract class  pen{
    abstract void write();
    abstract void refill();
}
class fauntainPen extends pen{
    void write(){
        System.out.println("This is write method");
    }
    void refill(){
        System.out.println("Refill..");
    }
    void changeNib(){
        System.out.println("changing Nib of pen");
    }
}
public class example_on_inheritance_1 {
    public static void main(String[] args){
        fauntainPen pen=new fauntainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
}

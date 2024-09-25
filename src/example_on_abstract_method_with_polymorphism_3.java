
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smarttelephone extends telephone{
    void ring(){
        System.out.println("The phone is ringing ");
    }
    void lift(){
        System.out.println("Phone is pickuped ");
    }
    void disconnect(){
        System.out.println("The phone is disconnect");
    }
    void connection(){
        System.out.println("check connection");
    }
}
public class example_on_abstract_method_with_polymorphism_3 {
    public static void main(String[] args) {
//        This is polymorphism
        telephone smt=new Smarttelephone();
        smt.disconnect();
        smt.lift();
        smt.ring();

//        smt.connection();    // it cannot execute
    }
}

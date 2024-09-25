/*
inheritance in interface :
                we can define many interface in a single program and can be implemented in same class also
                we can inherit the interface from an existing interface by "extends" keyword
                syntax:
                    interface a{}
                    interface b extends a{}
 */

interface parentInterface{
    void method1();
    void method2();
}
//we can extends interface from interface but not to class
//class childInterface extends parentInterface  // =>>> invalid Syntax
interface childInterface extends parentInterface{
    void method3();
default void method4(){
        System.out.println("This is method 4 in interface ");
    }
}
class interfaces implements childInterface {
    public void method1(){
        System.out.println("This is mehtod 1 ");
    }
    public void method2(){
        System.out.println("This is mehtod 2 ");
    }
    public void method3(){
        System.out.println("This is mehtod 3");
    }

}

public class inheritance_In_interface {
    public static void main(String[] args){
        interfaces inter=new interfaces();
        inter.method1();
        inter.method2();
        inter.method3();
        inter.method4();
    }
}

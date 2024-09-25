
/*
Method Overriding :
        it is a process of defining method in Base class and redefined in the Derived class
      */

class base2{
    int a=10;
    public void method1(){
        System.out.println("This is method 1 of Base class and value is : "+a);
    }
}
class derived2 extends base2{
    @Override
    public void method1(){
        System.out.println("This is overriding method 1 which is declaring in the BASE class");
    }
}
public class method_overriding {
    public static void main(String[] args) {

        base2 b=new base2();
        b.method1();
         derived2 d=new derived2();
         d.method1();
    }
}

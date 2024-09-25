/*
default method :
            default method is a method which is declared and defined in a "interface" and it is NOT necessary to redefined that method
              *** NOTE ****
             access specifier of the default method is "default" then is accessible
             if it is private then it is not accessible
 */


interface myinterface{
    default void second(){
        System.out.println("This is second method which is declared in interface ");
    }
    void first();
}
class d_method implements myinterface{
    public void first(){
        System.out.println("This is inteface method declared in class : ");
    }
//    public void second(){
//        System.out.println("This is second METHOD IN CLASS ");
//    }
//
}
public class default_methods{

    public static void main(String[] args){
        System.out.println("This is main function");
        d_method d=new d_method();
        d.first();
        d.second();
    }
}




//interface Animal{
//    // Default method
//    default void say(){
//        System.out.println("Hello, this is default method");
//    }
//    // Abstract method
//    void bark();
//}
//
// class CWH implements Animal{
//
//    @Override
//    public void bark() {
//        System.out.println("Dog barks!");
//    }
//    public static void main(String[] args) {
//        CWH obj1 = new CWH();
//        obj1.bark();
//        obj1.say();
//
//    }
//}
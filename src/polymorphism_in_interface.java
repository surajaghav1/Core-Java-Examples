import org.w3c.dom.ls.LSOutput;
/*
polymorphism:
        it is a process of defining a object of class with reference of interface/or other parent class
        class parent {
        //body
        void demo(){
        System.out.println("demo");
            }
        }
        class child extends parent{
        //body
        void children(){
        System.out.println("This is childer");
                }
        }
        public static void main(String[] args){
           //in which create a objects of child class with reference of child class
           parent p=new child();
              p.demo();        //it is write
              p.children();   //it cause an a error, it never execute

 */
interface interface1{
    void method1();
}
interface interface2{
    void method2();
}
class first{
    void demo(){
        System.out.println("This is demo ");
    }
    void greet(){
        System.out.println("Good Morning ");
    }
}
class second extends first implements interface1,interface2{
    @Override
    public void method1(){
        System.out.println("This is method 1 ");
    }

    @Override
    public void method2() {
        System.out.println("This is method 2");
    }
}
public class polymorphism_in_interface {
    public static void main(String[] args) {
//    this reference can access all the methods of parent class and all interfaces
        second s = new second();
        System.out.println("This is methods of references of Second class");
        s.method1();  //interface1 method1
        s.method2();  //interface2 method2
        s.demo();     //class method
        s.greet();   //class methods
        System.out.println("*****\n******* mthods with references of 'interface1' : \n");

// Polymorphism
        interface1 inte=new second();
        inte.method1();  //only methods of interface can be  accessible
//        inte.demo();   // it can not be accessible
//        inte.method2();   // it can not be accessible

        System.out.println("*****\n******* mthods with references of 'interface2' : \n");
//        reference of "interface2" and object of second class it can be access only the methods of interface2
        interface2 inte2=new second();
        inte2.method2();
//        inte2.demo();      //it can not accessible
//        inte2.method1();      //it can not accessible

        first f=new first();
        f.demo();
        f.greet();
//        it only access the methods of first class
        first f1=new second();
        f1.greet();
        f1.demo();

    }

}


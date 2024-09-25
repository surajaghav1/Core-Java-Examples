/*
Abstract class :
            The class which contain at least one Abstract method called abstract class.
            syntax :
                abstract class parent{}
               ***NOTE **
                  It will never create object of ABSTRACT Class

 Abstract method :
                The method which only declared in class with "abstract" keyword and define in derived class called abstract method.
                syntax :
                    abstract DataType method_name();
                    ** NOTE **
                        It NEVER define in Parent/base class it define in derived class
 */
abstract class parent{
    public void demo(){
        System.out.println("Hello i am suraj");
    }
   abstract public void greet();
}

class child extends parent{
    @Override
    public void greet(){
        System.out.println("HII Good Morning !");
    }
    public void hii(){
        System.out.println("this is hii");
    }
}

//if you create a/inherit class from existing abstract class then must be override the method
//
class child2 extends child{
public void demo1(){
    System.out.println("PRint nothing");
}
}

public class Abstract_class_and_method {
    public static void main(String[] args){
//        parent p=new parent();    // it is not valid syntax
//        child c= new child();
        child2 c=new child2();
        c.greet();
        c.hii();
        c.demo();
        c.demo1();
    }
}


class base1{
    base1(){
        System.out.println("THis is base constructor ");
    }
    base1(int x){
        System.out.println("This is parameterized constructor with value is ; "+x);
    }
//    this is parameterized constructor which is which invoked by derived class's through super keyword
}
class derived1 extends base1{
    derived1(){
//        super(10);
//        super keyword :
//                  This is used to call a parameterized constructor of base class in inheritance
        System.out.println("This is derived constructor ");
    }

    derived1(int x,int y){
        super(x);
        System.out.println("This is parameterized constructor with value of y is ; "+y);
    }
}
class derived1_child extends derived1{
    derived1_child(){
        System.out.println("this is child class constructor ");
    }
    derived1_child(int x,int y, int z){
        super(x,y);
        System.out.println("This is child class parameterized constructor value of z : "+z);
    }
}
public class Constructor_in_inheritance {
    public static void main(String[] args) {

//        derived1 d=new derived1();
//        it will call only default constructor

//        derived1 d1=new derived1(10,29);
//        it will call parameterized constructor


        derived1_child c=new derived1_child(10,20,30);
//        it will call all other class constructor


//        *********** NOTE ***********
//        The execution of Constructor in Inheritance in TOP to BOTTOM 
    }
}

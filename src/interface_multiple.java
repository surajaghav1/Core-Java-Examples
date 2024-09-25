/*
interface :
        we can define multiple interface in a program
        and multiple interface can be implemented to the same class
        syntax:
            class class_name implements interface1,interface2
            {
               // code
            }
  */
interface parent1{
    public void father();
//    we can define value here and can access through object of class but never redefined
//    int a =100 =>> it is "final" by default
    int a=100;
}
interface grand{
    public void grand_father();
}
class generation implements parent1,grand{
//    we can redefine the properties of interface
    int a=200;
    @Override
    public void father(){
        System.out.println("This is father method ");
    }
    @Override
    public void grand_father(){
        System.out.println("This is Grand father method called ");
    }
    public void demo(){
        System.out.println("This is demo method in class generation ");
    }
}
public class interface_multiple {
    public static void main(String[] args){
        generation g=new generation();
        g.father();
        g.grand_father();
        g.demo();
//        we can access the value/properties of interface but can not define it
        System.out.println("The value of a in inteface is : "+g.a);

//        g.a=200;  //invalid syntax
//        we can not access this property but if this is in the class it can be accessed
//        it gives an error because of "a" is final variable

        System.out.println("Value of a ; "+g.a);
        /*
        difference between interface and abstract class
          Interface                         Abstract class
          it can implement many times      it can implement/extends only one time
          it define by interface keyword    it defines by abstract keyword

         */
    }
}

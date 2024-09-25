
/*
Dynamic Method Dispatch =>>
            It is a process of creating object of derived class by using reference of PARENT class
            ** Reference of PARENT class and OBJECT of DERIVED class **
            syntax :
                base b=new derived();
           *** NOTE ******
           1. it can access only the parent class  methods as well as only OVERRIDDEN methods
           2. it can not access the DERIVED class methods
           3. the object of derived class which execute the OVERIDE function in DERIVED class it can not execute BASE class method

            */

class phone{
    public void showTime()
    {
        System.out.println("The time will be 4.30 PM ");
    }
    public void turnON(){
        System.out.println("MOBILE phone turning on ...");
    }
}
class smartphone extends phone{
    public void turnON(){
        System.out.println("SmartPHONE turning on !!!!!!");
    }
    public  void music(){
        System.out.println("Playing music ...");
    }
}
public class Dynamic_method_Dispatch {
    public static void main(String[] args){
//        it is valid syntax
        phone p=new smartphone();
        p.showTime();
        p.turnON();



//        p.music();    // it can not be execute
//        It is Invalid syntax :
//        smartphone sm=new phone();
    }
}

//  reference object_name = new classname()
//it will access only the methods which are present in reference
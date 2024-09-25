
interface animal{
    void eat();
    void step();
}
class monkey{
    void bite(){
        System.out.println("Mokey can bite ");
    }
    void jump(){
        System.out.println("Monkey can jump fastly ");
    }

}

class human extends monkey implements animal{
    public void eat(){
        System.out.println("Eating ");
    }
    public void step(){
        System.out.println("Step step ");
    }
}
public class example_on_interface_1 {
    public static void main(String[] args) {
        human h=new human();
        h.eat();
        h.step();
        h.jump();
        h.bite();


//        polymorphism :
        monkey m=new human();
        m.bite();  // it only access this methods
        m.jump();
    }
}

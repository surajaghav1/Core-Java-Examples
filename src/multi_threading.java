
/*
multi-Threading :
            it is a process of running the multiple tasks at a concurrently
            **** Two Ways to run threads ***
            1. By extends the Thread class
            2. By implementing the Thread interface

            **************************
            for executing that class methods "run" required start() method
            ex :
                object_name.start();
 */


// multi- threading using extending class
class multi extends Thread
{
    @Override
    public void run() {
     int i=0;
     while (i<50){
        System.out.println("This is run method ");
        i++;
    }
    }
}
class multi2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("I am doing java lectures");
            i++;
        }
    }
}
public class multi_threading {
    public static void main(String[] args) {
    multi m=new multi();
            m.start();
    multi2 m2=new multi2();
            m2.start();   // => start() is used to run this method
    }

}

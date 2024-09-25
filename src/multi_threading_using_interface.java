/*

multi-threading : using interface
 we need to create object of Thread and in which pass the object of class

 *************
 implement Runnable interface in class and override the method run();

 */
class multi_thread1 implements Runnable{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Tis is threading 1 !!!");
        }
    }
}
class multi_thread2 implements Runnable{
    public void run(){
        for (int i=0;i<50;i++){
            System.out.println("This is threading 2 ????????");
        }
    }
}

public class multi_threading_using_interface {
    public static void main(String[] args){
        multi_thread1 t1=new multi_thread1();
        Thread fire=new Thread(t1);


        /*
        for calling the method of class we need to create object of class and pass in the object of multi_thread

         */
        multi_thread2 t2=new multi_thread2();  //class object created
        Thread fire2=new Thread(t2);        //Thread object created
        fire2.start();                  //for executing the "run()" method we need to use start() method
        fire.start();                    // start method is accessible to only Thread object
    }
}

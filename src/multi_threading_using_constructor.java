class mythread extends Thread{
    public  mythread(String name){
        super(name);   //this name will be passed to the thread method we can access through getName();

    }
    public void run(){
        System.out.println("This is method run ");
    }

}
public class multi_threading_using_constructor {
    public static void main(String[] args) {
        mythread m=new mythread("suraj");
        m.start();
        System.out.println("WE can get method name : "+m.getName());
        System.out.println("Id of thread is : "+m.getId());
    }
}

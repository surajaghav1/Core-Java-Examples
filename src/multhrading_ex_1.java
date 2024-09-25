
class gm extends Thread {
    public void run(){
        int i=0;
        while (i<50) {
            System.out.println("Good evening ");
            i++;
        }
    }
}
class wel extends Thread {
    public void run(){
        int i=0;
        while (i<50) {
//            try {
//                Thread.sleep(200);// This function is used to delay the method execution
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Welcome ");
            i++;

        }
    }
}
public class multhrading_ex_1 {
    public static void main(String[] args) {
        gm g =new gm();
        wel w=new wel();
        g.start();
        w.start();
        System.out.println("Without setting the priority : "+g.getPriority());
        System.out.println("Without setting the priority : "+w.getPriority());
        g.setPriority(5);
        w.setPriority(7);
        System.out.println("Priority of gm class "+g.getPriority());
        System.out.println("Priority of wel class "+w.getPriority());

//        for givining priority to first class method we use "join()" method
//        try {
//            g.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        w.start // here we assign
//       w.run() execute after finishing the g.run();
    }
}

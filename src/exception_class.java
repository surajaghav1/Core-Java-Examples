import java.util.Scanner;
/*
throw :
        we use throw keyword for calling the predefined method in class Exception which is inherited
        try{
        }
        cathc(Exception e) {
          System.out.println(e.getMessage());
          System.out.println(e.toString());
          System.out.println(e);   //by default toString() method called automatically through e only
 */
class excep extends Exception{
    @Override
    public String getMessage() {
        return"Hii This is getMessage() method";
    }

    @Override
    public String toString() {
        return"This is toString() method ";
    }
}
public class exception_class {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter value : ");
    int a=sc.nextInt();
    if(a>10){
        try {
            throw new excep();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
        }
    }
    }
}

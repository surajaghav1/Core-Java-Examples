import java.util.Scanner;

class ex2 extends Exception{
    @Override
    public String toString() {
        return "Wrong choice Multiple times ";
    }
}
public class exception_handling_ex2_custom {
    public static void main(String[] args) {
        int arr[]={10,22,33,43};
        int index,i=0;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);

            while (flag && i<5) {
                try {

                System.out.println("enter index no ");
                index = sc.nextInt();
                break;
                }
                catch (Exception e){
                    System.out.println(e);
                    if(i>=5){
                        e.getMessage();
                    }
                }
            }



    }
}

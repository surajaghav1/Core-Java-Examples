import java.util.Scanner;

public class nested_try_catch_block {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=29;
        arr[1]=200;
        arr[2]=9;
        arr[3]=290;
        arr[4]=209;
       boolean flag=true;
        Scanner scanner=new Scanner(System.in);

       while (flag){
           System.out.println("enter arry of index : ");
           int index=scanner.nextInt();
           try {
               System.out.println("Welcome ");
               try {
                   System.out.println("Enter arry of index : "+arr[index]);
                   flag=false;
               }
               catch (ArrayIndexOutOfBoundsException e){
                   System.out.println("arry index does not found");
               }
           }
           catch (Exception e){
               System.out.println("Exception occured : "+e);
           }
       }
    }
}

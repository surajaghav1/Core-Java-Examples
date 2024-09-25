import java.util.Scanner;

public class exception_handling_ex1 {
    public static void main(String[] args) {
        int []arr=new int[4];
        arr[0]=10;
        arr[1]=100;
        arr[2]=25;
        arr[3]=14;
//        System.out.println("the array is ");
//        for (int i:arr){
//            System.out.println(i);
//        }

//        boolean flag=true   // =>> by true gives always
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        int index,j=0;
        while (flag && j<4){
            try {
                System.out.println("Enter endex no : ");
                index=sc.nextInt();
                System.out.println("value at index "+index+" "+arr[index]);
                break;
            }
            catch (Exception e){
                System.out.println("out of index : "+e);
                j++;
            }
            if(j>=4){
                System.out.println("Error !!");
            }
        }

    }
}

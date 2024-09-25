import java.util.Scanner;

public class handling_specific_exception {
    public static void main(String[] args) {
        int arr[]={1,233,23,54,77};
        System.out.println("The array is : ");
        for (int i=0;i<arr.length;i++){

            System.out.println("value at index "+i+" : "+arr[i]);

        }
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter index no : ");
        int index=scan.nextInt();
        System.out.println("Enter number to divide : ");
        int no=scan.nextInt();
        try {
            System.out.println("The value at  index : "+index+" is : "+arr[index]);
            System.out.println("The division of "+arr[index]+" and "+no+" is : "+arr[index]/no);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occured ");
            System.out.println(e);
        }
    }
}
